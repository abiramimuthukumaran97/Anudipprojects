import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Books } from '../Entity/books';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class BooksService {

  addEmpURL : string;
  getEmpURL : string;
  updateEmpUrl : string;
  deleteEmpUrl : string;

  constructor(private http : HttpClient) {

    this.addEmpURL = 'http://localhost:8086/postbooks';
    this.getEmpURL = 'http://localhost:8086/books';
    this.updateEmpUrl = 'http://localhost:8086/updatebooks';
    this.deleteEmpUrl = 'http://localhost:8086/deletebooks';

   }

   addBooks(books : Books): Observable<Books> {
     return this.http.post<Books>(this.addEmpURL,books);
   }

   getAllBooks(): Observable<Books[]>{
     return this.http.get<Books[]>(this.getEmpURL);
   }

   updateBooks(books :Books) : Observable<Books>{
     return this.http.put<Books>(this.updateEmpUrl, books);
   }
   
  findAll(): Observable<any> {
    console.log(Books)
    return this.http.get('http://localhost:8086/books');
  }

   deleteBooks(books : Books) : Observable<Books> {
     return this.http.delete<Books>(this.deleteEmpUrl+'/'+books.bookId);
   }
  

}