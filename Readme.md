Treatinder test assesment backend application.
Available endpoints:

| Method | Path                  | Usage                                      |
|--------|-----------------------|--------------------------------------------|
| POST   | /api/v1/register      | Returns new userId in $.userId field       |
| GET    | /api/v1/dogs          | Returns list of dogs by filters            |
| POST   | /api/v1/rate          | Send rate of dog                           |
| GET    | /api/v1/organizations | Returns list on organizations id and names |
| GET    | /api/v1/breeds        | Returns list of dog breeds                 |

Available filters:
- orgName - Accepts multiple values, e.g. organization=[ID1],[ID2].
- gender - male, female, unknown Accepts multiple values, e.g. gender=male,female.
- breed - Accepts multiple values, e.g. breed=pug,samoyed. Possible values may be looked up via Get Animal Breeds below.
- location - city, state; latitude,longitude; or postal code.

Register 
- Request
 ```JSON
 {
    "name": "Name",
    "passwordHash" : 123456789
}
```
- Response
```JSON
{
	"statusCode": 200,
	"errorMessage": null,
	"userId": 1
}
```
Save this userId and pass int header `X-user-id` with all others requests

