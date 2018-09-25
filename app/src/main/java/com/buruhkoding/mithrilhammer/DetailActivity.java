package com.buruhkoding.mithrilhammer;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static String EXTRA_POSITION;
    private TextView heroName, heroTitle, heroLore, heroAttackType, heroTopAbility, heroBaseAttack;
    private Hero detail;
    private Context context;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int position = getIntent().getIntExtra(EXTRA_POSITION, 2);
        detail = null;
        detail = HeroData.getHeroDetail(Integer.valueOf(position));

        heroName = (TextView)findViewById(R.id.hero_name);
        heroName.setText(detail.getName());
        heroTitle = (TextView)findViewById(R.id.hero_title);
        heroTitle.setText(detail.getTitle());
        heroLore = (TextView)findViewById(R.id.hero_lore);
        heroLore.setText(detail.getLore());
        heroAttackType = (TextView)findViewById(R.id.hero_attack_type);
        heroAttackType.setText(detail.getType());
        heroTopAbility = (TextView)findViewById(R.id.hero_top_ability);
        heroTopAbility.setText(detail.getTop_attribute());

        img = (ImageView)findViewById(R.id.hero_image);
//        Glide.with(context)
//                .load(detail.getImage())
//                .crossFade()
//                .into(img);
    }
}
