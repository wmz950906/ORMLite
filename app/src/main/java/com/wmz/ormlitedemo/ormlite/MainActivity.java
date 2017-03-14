package com.wmz.ormlitedemo.ormlite;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import com.wmz.ormlitedemo.ormlite.bean.Article;
import com.wmz.ormlitedemo.ormlite.bean.User;
import com.wmz.ormlitedemo.ormlite.db.ArticleDao;
import com.wmz.ormlitedemo.ormlite.db.UserDao;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        User u = new User();
        u.setName("zhanghongyan");
        new UserDao(getApplicationContext()).add(u);
        Article article = new Article();
        article.setTitle("ORMLitedeshiyong");
        article.setUser(u);
        new ArticleDao(getApplicationContext()).add(article);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
