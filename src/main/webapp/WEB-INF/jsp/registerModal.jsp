<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div id="registerModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
	<h3 id="myModalLabel">Register</h3>
  </div>
  <div class="modal-body">
	<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
		<p> Be a <b>Bookha</b>!</p>
		<form  name="sentMessage" id="registerForm" novalidate>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>Name</label>
					<input type="text" class="form-control" placeholder="Full Name" id="name" required data-validation-required-message="Please enter your full name">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>Street</label>
					<input type="text" class="form-control" placeholder="Street" id="street" required data-validation-required-message="Please enter your street">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>City</label>
					<input type="text" class="form-control" placeholder="City" id="city" required data-validation-required-message="Please enter your city">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>State</label>
					<input type="text" class="form-control" placeholder="State" id="state" required data-validation-required-message="Please enter your state">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>Contact No.</label>
					<input type="tel" class="form-control" placeholder="Contact No." id="contactno" required data-validation-required-message="Please enter your contact no.">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>Email Address</label>
					<input type="email" class="form-control" placeholder="Email Address" id="email" required data-validation-required-message="Please enter your email address.">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>Password</label>
					<input type="password" class="form-control" placeholder="*******" id="password" required data-validation-required-message="Please enter your password">
					<p class="help-block text-danger"></p>
				</div>
			</div>
			<br>
			<div id="register-result"></div>
			<div class="row">
				<div class="form-group col-xs-12">
					<button type="submit" class="btn btn-default">Login</button>
				</div>
			</div>
		</form>
	</div>
   </div>
</div>
    