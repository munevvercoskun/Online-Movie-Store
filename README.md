# Online-Movie-Store

Physical movie rentals are no longer the norm which is why the demand for online movie stores has increased. The movie store will allow customers to rent and buy movies online to watch from the comfort of their homes.

Platform purchases rights to sell movies from production companies and display them on their site. Customers create accounts and can view the selection of movies available. Customers will choose a movie to rent/buy and use credit/debit information.

The movie rental and purchasing website has various entities. First, the users must create an account, starting with the following attributes: first name, last name, email address, password, billing address, and card/debit information. To ensure customer uniqueness, each customer will be provided with a customer ID which will be the primary key attribute, not visible to the customer but saved in the database.

Rights to sell movies will be bought from production companies which will have similar attributes to users, including their own ID number as a primary key attribute. The following about the movies will be noted, production company name, password, movie title, genre, and direct deposit information.


**_The application will be able to provide information to the customers regarding:_**

• Movies that are rented

• Movies that are available in the storage of the application

• Movie purchase options

• Movie rental options

• How long can a movie be rented for

• Return conditions/policies

**_The application will be able to provide information to the seller regarding:_**

• Previously rented movies

• Movies that are available in the storage of the application

• Movies that are bought

• Customer account information

• Purchase/rental history

• Production company rights limitations and restrictions



| ROLE | DESCRIPTION |
|------|-------------|
|Remove Bought Movies|This function removes a movie from within our database when its purchased|
|Add New Movies|This function adds a new movie into our database when its rights are bought from the production company|
|Rent a Movie|This function allows customers to rent movies and adds new information to our database|
|Expiry Date|This function sets a certain time period for customers who rented the movie to see the movie|
|Adding New Customer|This function creates new information in our database about the new customer (Email, Name, Password, Username, etc.)|
|Renting/Purchasing a Movie|This function(s) collects information about the customer’s payment method (Card number, Card Holder’s Name, CVV, Expiry Date, etc.) and stores it in our database.|
