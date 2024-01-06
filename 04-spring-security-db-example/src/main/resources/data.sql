INSERT INTO `role` (`role_id`, `role`) VALUES	(1,'ADMIN'),(2,'USER');
INSERT INTO `users` (`user_id`, `active`, `email`, `last_name`, `first_name`, `password`)
VALUES 	(1,1,'user@gmail.com','Hussain','Shahzad','user'),	(2,1,'admin@gmail.com','User','Admin','admin');
INSERT INTO `user_role` (`user_id`, `role_id`) VALUES 	(1,1),(2,1);
