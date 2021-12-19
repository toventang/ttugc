package com.p2082ss.android.ugc.aweme.discover.p2797ui;

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

/* renamed from: com.ss.android.ugc.aweme.discover.ui.NoticeView */
public final class NoticeView extends LinearLayout implements View.OnClickListener, AbstractC17178d {

    /* renamed from: a */
    RemoteImageView f99306a;

    /* renamed from: b */
    ImageView f99307b;

    /* renamed from: c */
    TextView f99308c;

    /* renamed from: d */
    View f99309d;

    /* renamed from: e */
    View f99310e;

    /* renamed from: f */
    private AbstractC42575a f99311f;

    /* renamed from: g */
    private int f99312g;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.NoticeView$a */
    public interface AbstractC42575a {
        static {
            Covode.recordClassIndex(50675);
        }

        /* renamed from: a */
        void mo72753a();

        /* renamed from: b */
        void mo72754b();
    }

    static {
        Covode.recordClassIndex(50674);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d
    /* renamed from: a */
    public final void mo27128a(int i) {
    }

    public final TextView getTitleTextView() {
        return this.f99308c;
    }

    public final void setOnInternalClickListener(AbstractC42575a aVar) {
        this.f99311f = aVar;
    }

    private void setColorMode(int i) {
        if (this.f99312g != i) {
            this.f99312g = i;
        }
    }

    public final void setCloseImage(int i) {
        this.f99307b.setImageResource(i);
    }

    public final void setIconImage(int i) {
        this.f99306a.setImageResource(i);
    }

    public final void setNoticeBackgroundColor(int i) {
        this.f99310e.setBackgroundColor(i);
    }

    public final void setTitleText(CharSequence charSequence) {
        this.f99308c.setText(charSequence);
    }

    public final void setTitleTextColor(int i) {
        this.f99308c.setTextColor(i);
    }

    public final void setCloseImage(Bitmap bitmap) {
        this.f99307b.setImageBitmap(bitmap);
    }

    public final void setIconImage(Bitmap bitmap) {
        this.f99306a.setImageBitmap(bitmap);
    }

    public final void setTitleText(String str) {
        this.f99308c.setText(str);
    }

    public final void setIconImage(UrlModel urlModel) {
        C34577e.m70592a(this.f99306a, urlModel);
    }

    public final void setTitleText(int i) {
        this.f99308c.setText(getContext().getResources().getText(i));
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f99311f != null) {
            if (view.getId() == R.id.bu5) {
                this.f99311f.mo72754b();
            } else if (view.getId() == R.id.eja) {
                this.f99311f.mo72753a();
            }
        }
    }

    public NoticeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NoticeView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(3222);
        this.f99312g = -1;
        inflate(context, R.layout.aj6, this);
        this.f99306a = (RemoteImageView) findViewById(R.id.bwm);
        this.f99307b = (ImageView) findViewById(R.id.bu5);
        this.f99308c = (TextView) findViewById(R.id.f63);
        this.f99309d = findViewById(R.id.eja);
        this.f99310e = findViewById(R.id.ctv);
        this.f99307b.setOnTouchListener(new View$OnTouchListenerC33468a(0.5f));
        this.f99309d.setOnTouchListener(new View$OnTouchListenerC33468a(0.5f));
        this.f99307b.setOnClickListener(this);
        this.f99309d.setOnClickListener(this);
        setColorMode(C17175b.C17176a.f40922a.f40921a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.o3, R.attr.vz, R.attr.a6b, R.attr.aix, R.attr.aj5, R.attr.aj7});
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            this.f99306a.setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            this.f99307b.setImageDrawable(drawable2);
        }
        this.f99308c.setText(obtainStyledAttributes.getString(4));
        this.f99308c.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
        this.f99310e.setBackgroundColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.nc)));
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(3222);
    }
}
