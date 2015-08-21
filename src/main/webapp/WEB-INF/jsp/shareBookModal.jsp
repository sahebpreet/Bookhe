<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div id="shareBookModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
	<h3 id="myModalLabel">Share Your Book</h3>
  </div>
  <div class="modal-body">
	<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
		<p> Share a  <b>Book</b>!</p>
		<form name="sentMessage" id="addBook" novalidate>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>Book ISBN</label>
					<input type="text" class="form-control" placeholder="Book ISBN" id="bookISBN" required data-validation-required-message="Please enter book ISBN number.">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>Book Name</label>
					<input type="text" class="form-control" placeholder="Book Name" id="bookName" required data-validation-required-message="Please enter book name.">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>Book Author</label>
					<input type="text" class="form-control" placeholder="Book Author" id="bookAuthor" required data-validation-required-message="Please enter book Author Name.">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>Book Publisher</label>
					<input type="text" class="form-control" placeholder="Book Publisher" id="bookPublisher" required data-validation-required-message="Please enter book PublisherName.">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>Published Year</label>
					<input type="number" class="form-control" placeholder="Published Year" id="publishedYear" required data-validation-required-message="Please enter book Publisheed Year.">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>Book Cost</label>
					<input type="number" class="form-control" placeholder="Book Cost" id="bookCost" required data-validation-required-message="Please enter book cost.">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>Book Category</label>
					<input type="text" class="form-control" placeholder="Book Category" id="bookCategory" required data-validation-required-message="Please enter book Category.">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>E-Book URL </label>
					<input type="text" class="form-control" placeholder="www.E-Book.com" id="eBookURL" required data-validation-required-message="Please enter E-Book URL.">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-xs-12">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</div>

		</form>
	</div>
   </div>
</div>
    