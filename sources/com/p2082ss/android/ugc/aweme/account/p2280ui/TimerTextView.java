package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.ui.TimerTextView */
public final class TimerTextView extends TuxTextView implements C32308a.AbstractC32309a {

    /* renamed from: a */
    public static final C32986a f78511a = new C32986a((byte) 0);

    /* renamed from: b */
    private C32308a.AbstractC32309a f78512b;

    /* renamed from: e */
    private C32308a f78513e;

    /* renamed from: f */
    private long f78514f;

    /* renamed from: g */
    private long f78515g;

    /* renamed from: h */
    private String f78516h;

    static {
        Covode.recordClassIndex(39789);
    }

    public TimerTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.TimerTextView$a */
    public static final class C32986a {
        static {
            Covode.recordClassIndex(39790);
        }

        private C32986a() {
        }

        public /* synthetic */ C32986a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
    /* renamed from: a */
    public final void mo796a() {
        C32308a.AbstractC32309a aVar = this.f78512b;
        if (aVar != null) {
            aVar.mo58205a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
    /* renamed from: b */
    public final void mo58206b() {
        C32308a.AbstractC32309a aVar = this.f78512b;
        if (aVar != null) {
            aVar.mo58206b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C32308a aVar = this.f78513e;
        if (aVar != null) {
            aVar.mo58385a(null);
        }
        this.f78512b = null;
    }

    /* renamed from: c */
    public final C32308a mo58808c() {
        if (this.f78513e == null) {
            this.f78513e = new C32308a(this.f78514f, this.f78515g, this);
        }
        C32308a aVar = this.f78513e;
        if (aVar == null) {
            C89219l.m154715b();
        }
        aVar.mo58384a();
        C32308a aVar2 = this.f78513e;
        if (aVar2 == null) {
            C89219l.m154715b();
        }
        return aVar2;
    }

    public final void setCallback(C32308a.AbstractC32309a aVar) {
        C89219l.m154721d(aVar, "");
        this.f78512b = aVar;
    }

    /* renamed from: a */
    public final void mo58807a(String str) {
        C89219l.m154721d(str, "");
        mo58805a(60000, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
    /* renamed from: a */
    public final void mo58389a(long j) {
        String str = this.f78516h;
        if (str == null) {
            C89219l.m154715b();
        }
        m67623b(j, str);
        C32308a.AbstractC32309a aVar = this.f78512b;
        if (aVar != null) {
            aVar.mo58389a(j);
        }
    }

    /* renamed from: a */
    public final void mo58806a(C32308a aVar) {
        C89219l.m154721d(aVar, "");
        this.f78513e = aVar;
        if (aVar.mo58388d()) {
            mo796a();
            aVar.mo58385a(this);
            return;
        }
        aVar.mo58384a();
    }

    /* renamed from: b */
    private final void m67623b(long j, String str) {
        setText(String.valueOf(j / 1000) + str);
    }

    /* renamed from: a */
    public final void mo58805a(long j, String str) {
        C89219l.m154721d(str, "");
        this.f78516h = str;
        this.f78514f = 60000;
        this.f78515g = 1000;
        m67623b(j, str);
    }

    private /* synthetic */ TimerTextView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TimerTextView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.ce);
        String str = "";
        C89219l.m154721d(context, str);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.s7, R.attr.afz});
        C89219l.m154716b(obtainStyledAttributes, str);
        this.f78514f = (long) obtainStyledAttributes.getInteger(0, 60000);
        String string = obtainStyledAttributes.getString(1);
        this.f78516h = string != null ? string : str;
        obtainStyledAttributes.recycle();
        this.f78515g = 1000;
    }
}
