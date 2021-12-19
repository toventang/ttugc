package com.p2082ss.android.ugc.aweme.kids.profile.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p2307ai.View$OnTouchListenerC33468a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.profile.base.NoticeView */
public final class NoticeView extends LinearLayout implements View.OnClickListener, AbstractC17178d {

    /* renamed from: a */
    RemoteImageView f131763a;

    /* renamed from: b */
    ImageView f131764b;

    /* renamed from: c */
    TextView f131765c;

    /* renamed from: d */
    View f131766d;

    /* renamed from: e */
    View f131767e;

    /* renamed from: f */
    private AbstractC57758a f131768f;

    /* renamed from: g */
    private int f131769g;

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.base.NoticeView$a */
    public interface AbstractC57758a {
        static {
            Covode.recordClassIndex(67745);
        }

        /* renamed from: a */
        void mo95082a();

        /* renamed from: b */
        void mo95083b();
    }

    static {
        Covode.recordClassIndex(67744);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d
    /* renamed from: a */
    public final void mo27128a(int i) {
    }

    public final TextView getTitleTextView() {
        return this.f131765c;
    }

    public final void setOnInternalClickListener(AbstractC57758a aVar) {
        this.f131768f = aVar;
    }

    private void setColorMode(int i) {
        if (this.f131769g != i) {
            this.f131769g = i;
        }
    }

    public final void setCloseImage(int i) {
        this.f131764b.setImageResource(i);
    }

    public final void setIconImage(int i) {
        this.f131763a.setImageResource(i);
    }

    public final void setNoticeBackgroundColor(int i) {
        this.f131767e.setBackgroundColor(i);
    }

    public final void setTitleText(CharSequence charSequence) {
        this.f131765c.setText(charSequence);
    }

    public final void setTitleTextColor(int i) {
        this.f131765c.setTextColor(i);
    }

    public final void setCloseImage(Bitmap bitmap) {
        this.f131764b.setImageBitmap(bitmap);
    }

    public final void setIconImage(Bitmap bitmap) {
        this.f131763a.setImageBitmap(bitmap);
    }

    public final void setTitleText(String str) {
        this.f131765c.setText(str);
    }

    public final void setIconImage(UrlModel urlModel) {
        C34577e.m70592a(this.f131763a, urlModel);
    }

    public final void setTitleText(int i) {
        this.f131765c.setText(getContext().getResources().getText(i));
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f131768f != null) {
            if (view.getId() == R.id.bu5) {
                this.f131768f.mo95083b();
            } else if (view.getId() == R.id.eja) {
                this.f131768f.mo95082a();
            }
        }
    }

    public NoticeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NoticeView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(11845);
        this.f131769g = -1;
        inflate(context, R.layout.ado, this);
        this.f131763a = (RemoteImageView) findViewById(R.id.bwm);
        this.f131764b = (ImageView) findViewById(R.id.bu5);
        this.f131765c = (TextView) findViewById(R.id.f63);
        this.f131766d = findViewById(R.id.eja);
        this.f131767e = findViewById(R.id.ctv);
        this.f131764b.setOnTouchListener(new View$OnTouchListenerC33468a(0.5f));
        this.f131766d.setOnTouchListener(new View$OnTouchListenerC33468a(0.5f));
        this.f131764b.setOnClickListener(this);
        this.f131766d.setOnClickListener(this);
        setColorMode(C17175b.C17176a.f40922a.f40921a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.o3, R.attr.vz, R.attr.a6b, R.attr.aix, R.attr.aj5, R.attr.aj7});
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            this.f131763a.setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            this.f131764b.setImageDrawable(drawable2);
        }
        this.f131765c.setText(obtainStyledAttributes.getString(4));
        this.f131765c.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
        this.f131767e.setBackgroundColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.nc)));
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(11845);
    }
}
