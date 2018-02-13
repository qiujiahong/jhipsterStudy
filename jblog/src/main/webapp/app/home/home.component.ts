import {Component, OnInit} from '@angular/core';
import {Post} from '../entities/post/post.model';
import {PostService} from '../entities/post/post.service';


@Component({
    selector: 'jhi-home',
    templateUrl: './home.component.html',
    styleUrls: [
        'home.css'
    ]

})
export class HomeComponent implements OnInit {

    posts: Post[] = [];

    constructor(private  postService: PostService) {}

    loadAll() {
        this.postService.query().subscribe(
            (res) => {
                console.log(res);
                this.posts = res.body;
            },
            error => {
                console.log(error);
            }
            // (res: ResponseWrapper) => {
            //     console.log(res.json);
            //     this.posts = res.json;
            // },
            // (res: ResponseWrapper) => {
            //     console.log( res.json );
            // }
        );
    }

    ngOnInit() {
        console.log('ngOnInit...');
        this.loadAll();
    }
}
