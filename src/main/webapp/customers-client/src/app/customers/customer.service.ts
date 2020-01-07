import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable()
export class CustomerService {
  private baseUrl = "http://localhost:8080/api/customer";

  constructor(private httpClient: HttpClient) {}

  getCustomer(id: string): Observable<Object> {
    return this.httpClient.get(`${this.baseUrl}/${id}`);
  }

  createCustomer(customer: Object): Observable<Object> {
    return this.httpClient.post(`${this.baseUrl}/create`, customer);
  }

  updateCustomer(id: string, value: any): Observable<Object> {
    return this.httpClient.put(`${this.baseUrl}/${id}`, value);
  }

  deleteCustomer(id: string): Observable<any> {
    return this.httpClient.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getCustomersList(query = {}): Observable<any> {
    return this.httpClient.get(`${this.baseUrl}`);
  }

  deleteAll(): Observable<any> {
    return this.httpClient.delete(`${this.baseUrl}` + `/delete`, { responseType: 'text' });
  }
}
