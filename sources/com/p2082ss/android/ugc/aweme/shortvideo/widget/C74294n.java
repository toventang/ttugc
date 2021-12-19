package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.n */
public final class C74294n extends ConstraintLayout {

    /* renamed from: g */
    private TextView f167061g;

    /* renamed from: h */
    private TextView f167062h;

    static {
        Covode.recordClassIndex(87066);
    }

    public final TextView getTextView() {
        return this.f167061g;
    }

    public final CharSequence getTagText() {
        return this.f167062h.getText();
    }

    /* renamed from: b */
    public final void mo9139b() {
        this.f167061g.setPadding((int) C13628n.m24520b(getContext(), 12.0f), (int) C13628n.m24520b(getContext(), 6.0f), (int) C13628n.m24520b(getContext(), 12.0f), (int) C13628n.m24520b(getContext(), 6.0f));
    }

    public C74294n(Context context) {
        this(context, (byte) 0);
    }

    public final void setTabSelected(boolean z) {
        this.f167061g.setSelected(z);
    }

    public final void setTextColor(int i) {
        this.f167061g.setTextColor(i);
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f167061g.setText(str);
        }
    }

    private C74294n(Context context, byte b) {
        this(context, (char) 0);
    }

    private C74294n(Context context, char c) {
        super(context, null, 0);
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b2r, this, true);
        this.f167061g = (TextView) a.findViewById(R.id.ee5);
        this.f167062h = (TextView) a.findViewById(R.id.ee4);
    }
}
