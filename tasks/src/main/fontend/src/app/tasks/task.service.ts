import {Http} from "@angular/http";
import {Injectable} from "@angular/core";
import "rxjs/add/operator/map";
import {HttpClient} from "@angular/common/http";


@Injectable()
export  class TaskService{

    constructor(private http:HttpClient){

    }

    //从spring boot 中获取数据
    getTasks(){
        // return this.http.get('api/tasks').map(response => response.json())
        return this.http.get('api/tasks');
    }
}
