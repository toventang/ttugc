package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.q */
public final class C73064q extends RelativeLayout {

    /* renamed from: a */
    private TextView f163959a;

    /* renamed from: b */
    private TextView f163960b;

    static {
        Covode.recordClassIndex(85767);
    }

    public final void setSelect(boolean z) {
        if (z) {
            TextView textView = this.f163959a;
            if (textView != null) {
                textView.setTextColor(C0643b.m2378c(getContext(), R.color.c0));
            }
            TextView textView2 = this.f163960b;
            if (textView2 != null) {
                textView2.setTextColor(C0643b.m2378c(getContext(), R.color.c0));
                return;
            }
            return;
        }
        TextView textView3 = this.f163959a;
        if (textView3 != null) {
            textView3.setTextColor(C0643b.m2378c(getContext(), R.color.c2));
        }
        TextView textView4 = this.f163960b;
        if (textView4 != null) {
            textView4.setTextColor(C0643b.m2378c(getContext(), R.color.c2));
        }
    }

    /* renamed from: a */
    public final void mo115489a(String str, long j) {
        C89219l.m154721d(str, "");
        TextView textView = this.f163960b;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f163959a;
        if (textView2 != null) {
            textView2.setText(C53437b.m98615a(j));
        }
    }

    public C73064q(Context context, boolean z) {
        super(context);
        View a;
        TextView textView;
        MethodCollector.m26663i(7801);
        if (z) {
            a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.biy, this, false);
        } else {
            a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bj0, this, false);
        }
        TextView textView2 = null;
        if (a != null) {
            textView = (TextView) a.findViewById(R.id.eue);
        } else {
            textView = null;
        }
        this.f163959a = textView;
        this.f163960b = a != null ? (TextView) a.findViewById(R.id.f0k) : textView2;
        addView(a);
        MethodCollector.m26664o(7801);
    }
}
