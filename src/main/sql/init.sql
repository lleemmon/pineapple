-- pineapple.problem definition

CREATE TABLE `problem` (
   `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
   `content` varchar(1023) COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目内容',
   `categorize` int NOT NULL COMMENT '类型 1选择题 2填空题',
   `answer` varchar(127) COLLATE utf8mb4_general_ci NOT NULL COMMENT '答案',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='题目表';
