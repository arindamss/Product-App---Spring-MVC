# Product Management Web Application

This project is a simple web application built using Spring Framework that allows users to manage a list of products. The application includes functionalities to add, view, update, and delete products from a database.

## Features

- **Add Product**: Users can add a new product by filling out a form.
- **View All Products**: The application displays a list of all products stored in the database.
- **Delete Product**: Users can delete a product from the database by clicking on a delete button associated with each product.
- **Update Product**: Users can update the details of a product by clicking on an update button associated with each product, which opens a form pre-filled with the existing product details.

## Controller Details

The `MainController` class serves as the main controller for handling HTTP requests. It includes the following request mappings:

- **"/"**: Redirects to the "/allProduct" endpoint to display all products.
- **"/addForm"**: Displays a form for adding a new product.
- **"/formAdd"**: Handles the form submission for adding a new product to the database.
- **"/allProduct"**: Displays a list of all products stored in the database.
- **"/delete/{id}"**: Deletes a product with the specified ID from the database.
- **"/update/{id}"**: Displays a form pre-filled with the details of the product to be updated.
- **"/formUpdate"**: Handles the form submission for updating a product in the database.

## Dependencies

This project relies on the following dependencies:

- Spring Framework
- Spring Boot
- JSP (for server-side HTML rendering)
- Hibernate (for database connectivity)

## Usage

To use this project:

1. Clone the repository to your local machine.
2. Set up a database and configure the database connection properties in the `application.properties` file.
3. Build and run the project using Maven or your preferred IDE.
4. Access the application through a web browser.

## Contributors

- [Arindam Karmakar](https://github.com/arindamss) 


