package com.wxcampus.items;

import com.jfinal.plugin.activerecord.Model;

/**
 * mysql> desc trades;
+--------------+---------------+------+-----+---------+----------------+
| Field        | Type          | Null | Key | Default | Extra          |
+--------------+---------------+------+-----+---------+----------------+
| tid          | int(10)       | NO   | PRI | NULL    | auto_increment |
| rid          | int(10)       | NO   |     | NULL    |                |
| customer     | int(10)       | NO   |     | NULL    |                |
| seller       | int(10)       | NO   |     | NULL    |                |
| location     | int(10)       | NO   |     | NULL    |                |
| item         | int(10)       | NO   |     | NULL    |                |
| price        | decimal(10,2) | NO   |     | NULL    |                |
| orderNum     | int(5)        | NO   |     | NULL    |                |
| state        | int(1)        | NO   |     | NULL    |    state=0表示正在派送     =1 表示已完成的订单              |
| addedDate    | date          | NO   |     | NULL    |                |
| addedTime    | time          | NO   |     | NULL    |                |
| finishedDate | date          | YES  |     | NULL    |                |
| finishedTime | time          | YES  |     | NULL    |                |
+--------------+---------------+------+-----+---------+----------------+
 * @author Potato
 *
 */
@SuppressWarnings("serial")
public class Trades extends Model<Trades>{
	
	public static final Trades dao=new Trades();

}
