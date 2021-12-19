package com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2975b;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50445e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.b.a */
public final class C50450a extends FrameLayout {

    /* renamed from: c */
    public static final C50451a f116518c = new C50451a((byte) 0);

    /* renamed from: a */
    public AbstractC49849am f116519a;

    /* renamed from: b */
    public C50445e f116520b;

    /* renamed from: d */
    private C50445e f116521d;

    /* renamed from: e */
    private SparseArray f116522e;

    static {
        Covode.recordClassIndex(59586);
    }

    /* renamed from: a */
    public final View mo85702a(int i) {
        if (this.f116522e == null) {
            this.f116522e = new SparseArray();
        }
        View view = (View) this.f116522e.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f116522e.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.b.a$a */
    public static final class C50451a {
        static {
            Covode.recordClassIndex(59587);
        }

        private C50451a() {
        }

        public /* synthetic */ C50451a(byte b) {
            this();
        }
    }

    public final C50445e getSt() {
        return this.f116521d;
    }

    public final VideoSeekBar getVideoSeekBar() {
        return (VideoSeekBar) mo85702a(R.id.fdm);
    }

    public final void setSt(C50445e eVar) {
        this.f116521d = eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.b.a$b */
    public static final class C50452b extends ViewPager.C1582h {

        /* renamed from: a */
        final /* synthetic */ C50450a f116523a;

        static {
            Covode.recordClassIndex(59588);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C50452b(C50450a aVar) {
            this.f116523a = aVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                this.f116523a.setVisibility(0);
            } else {
                this.f116523a.setVisibility(8);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C50450a(Context context) {
        this(context, (byte) 0);
        C89219l.m154721d(context, "");
    }

    public final void setLiveMode(boolean z) {
        if (z) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C50450a(Context context, byte b) {
        this(context, (char) 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C50450a(Context context, char c) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9864);
        setClipChildren(false);
        if (context != null) {
            C1870c.m6046a((Activity) context, R.layout.wx, this, true);
            ((TuxTextView) mo85702a(R.id.agw)).mo37697a(32.0f);
            ((TuxTextView) mo85702a(R.id.eml)).mo37697a(32.0f);
            MethodCollector.m26664o(9864);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        MethodCollector.m26664o(9864);
        throw nullPointerException;
    }
}
