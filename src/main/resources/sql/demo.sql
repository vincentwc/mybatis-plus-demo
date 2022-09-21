DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`          int(0)                                                       NOT NULL AUTO_INCREMENT COMMENT '主键',
    `nickname`    varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '昵称',
    `birthday`    date                                                         NOT NULL COMMENT '生日',
    `username`    varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
    `password`    varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
    `status`      varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  NOT NULL DEFAULT '0' COMMENT '状态 ',
    `create_time` datetime(0)                                                  NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
    `update_time` datetime(0)                                                  NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = Dynamic;

INSERT INTO `user`
VALUES (1, 'lh', '2022-06-29', '李大', '123456', '0', '2022-06-29 09:02:07', '2022-06-29 09:02:07');
INSERT INTO `user`
VALUES (2, 'ww', '2022-06-29', '陈大', '123456', '0', '2022-06-29 13:06:24', '2022-06-29 13:06:24');
INSERT INTO `user`
VALUES (3, 'aa', '2022-06-29', '刘达', '123456', '0', '2022-06-29 13:06:48', '2022-06-29 13:06:48');

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`
(
    `id`     int(0)                                                       NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `name`   varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '角色名称',
    `remark` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '角色描述',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = Dynamic;

INSERT INTO `role`
VALUES (1, '系统管理员', '系统管理员');
INSERT INTO `role`
VALUES (2, '数据管理员', '数据管理员');

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`
(
    `user_id` int(0) NOT NULL COMMENT '用户id',
    `role_id` int(0) NULL DEFAULT NULL COMMENT '角色id'
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = Dynamic;


INSERT INTO `user_role`
VALUES (1, 1);
INSERT INTO `user_role`
VALUES (1, 2);
INSERT INTO `user_role`
VALUES (2, 1);
INSERT INTO `user_role`
VALUES (2, 2);
INSERT INTO `user_role`
VALUES (3, 1);

