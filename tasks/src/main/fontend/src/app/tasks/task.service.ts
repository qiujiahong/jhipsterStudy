import {Injectable} from "@angular/core";
import "rxjs/add/operator/map";
import {HttpClient} from "@angular/common/http";
import {Task} from "./task.model";


@Injectable()
export  class TaskService{

    constructor(private http:HttpClient){

    }

    //从spring boot 中获取数据
    getTasks(){
        // return this.http.get('api/tasks').map(response => response.json())
        return this.http.get('api/tasks');
    }
    saveTask(task:Task,checked :boolean){
        task.completed = checked;
        //return this.http.post('api/tasks/save',task).map(response => response.json());
        return this.http.post<Task>('api/tasks/save',task);
    }
}
