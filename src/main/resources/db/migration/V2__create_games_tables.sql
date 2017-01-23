CREATE TABLE `blackjackdev`.`games` (
  `id`          INT NOT NULL AUTO_INCREMENT,
  `user_id`     INT NOT NULL,
  `version`     INT NOT NULL DEFAULT 0,
  `created`     TIMESTAMP NOT NULL DEFAULT now(),
  `modified`    TIMESTAMP NOT NULL DEFAULT now(),
  `status`      VARCHAR(45) NOT NULL,
  `bet_amount`  INT NOT NULL,
  `action`      ENUM('WIN', 'LOSE') NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_user_id`
  FOREIGN KEY (`user_id`)
  REFERENCES `users` (`id`));
