package com.zhihu.matisse.internal.p4516ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Item;

/* renamed from: com.zhihu.matisse.internal.ui.widget.MediaGrid */
public class MediaGrid extends SquareFrameLayout implements View.OnClickListener {

    /* renamed from: a */
    public SimpleDraweeView f199831a = ((SimpleDraweeView) findViewById(R.id.cj1));

    /* renamed from: b */
    public CheckView f199832b = ((CheckView) findViewById(R.id.a4k));

    /* renamed from: c */
    public ImageView f199833c = ((ImageView) findViewById(R.id.b_h));

    /* renamed from: d */
    public TextView f199834d = ((TextView) findViewById(R.id.fcf));

    /* renamed from: e */
    public Item f199835e;

    /* renamed from: f */
    public C87980b f199836f;

    /* renamed from: g */
    private AbstractC87979a f199837g;

    /* renamed from: com.zhihu.matisse.internal.ui.widget.MediaGrid$a */
    public interface AbstractC87979a {
        static {
            Covode.recordClassIndex(104002);
        }

        /* renamed from: a */
        void mo142497a(Item item, RecyclerView.ViewHolder viewHolder);

        /* renamed from: b */
        void mo142498b(Item item, RecyclerView.ViewHolder viewHolder);
    }

    static {
        Covode.recordClassIndex(104001);
    }

    public Item getMedia() {
        return this.f199835e;
    }

    public void setOnMediaGridClickListener(AbstractC87979a aVar) {
        this.f199837g = aVar;
    }

    public void setCheckEnabled(boolean z) {
        this.f199832b.setEnabled(z);
    }

    public void setChecked(boolean z) {
        this.f199832b.setChecked(z);
    }

    public void setCheckedNum(int i) {
        this.f199832b.setCheckedNum(i);
    }

    public void onClick(View view) {
        AbstractC87979a aVar = this.f199837g;
        if (aVar == null) {
            return;
        }
        if (view == this.f199831a) {
            aVar.mo142497a(this.f199835e, this.f199836f.f199841d);
        } else if (view == this.f199832b) {
            aVar.mo142498b(this.f199835e, this.f199836f.f199841d);
        }
    }

    public MediaGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.ak1, this, true);
        this.f199831a.setOnClickListener(this);
        this.f199832b.setOnClickListener(this);
    }

    /* renamed from: com.zhihu.matisse.internal.ui.widget.MediaGrid$b */
    public static class C87980b {

        /* renamed from: a */
        public int f199838a;

        /* renamed from: b */
        Drawable f199839b;

        /* renamed from: c */
        public boolean f199840c;

        /* renamed from: d */
        RecyclerView.ViewHolder f199841d;

        static {
            Covode.recordClassIndex(104003);
        }

        public C87980b(int i, Drawable drawable, boolean z, RecyclerView.ViewHolder viewHolder) {
            this.f199838a = i;
            this.f199839b = drawable;
            this.f199840c = z;
            this.f199841d = viewHolder;
        }
    }
}
