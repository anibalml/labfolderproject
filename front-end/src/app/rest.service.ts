import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';

const endpoint = 'http://localhost:8080/';
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};


@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(private http: HttpClient) { }

  private extractData(res: Response) {
    let body = res;
    return body || { };
  }

  getFreqSimil(input): Observable<any> {
    return this.http.post<any>(endpoint + 'get-freq-simil', JSON.stringify(input), httpOptions).pipe(
      map(this.extractData),
      catchError(this.handleError<any>('Operation')));
  }

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      
      alert("Functionality not available.");
      
      return of(result as T);
    };
  }
  
}
