## Inheritance

**Feature Tasks Lab 06**

- Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category.

- Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.

- A Review should be about a single Restaurant. implement it.

- Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant.

- Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.

- When associate a review with a restaurant, that restaurant’s star rating should change. addReview method updates the Restaurant star rating appropriately.

- if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.

**Feature Tasks Lab 07**

- Create a Shop class; a Shop should have a name, description, and number of dollar signs.

- Shop class has an instance method to add a review about that shop, and that it works just as well as the Restaurant instance method with the same purpose.

- Create a Theater class; a Theater should have a name and all of the movies currently showing there.

- Write addMovie and removeMovie instance methods that allow the theater to update which movies are being shown.

- Theater is just as reviewable as your Restaurant and your Shop.

- Some reviews should now have a String movie instance variable, to hold which movie that reviewer is referencing.

- Some review doesn’t have to include the movie they saw when they’re reviewing a theater.

- Add testing for any new functionality you’ve created.
