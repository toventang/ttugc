package com.p2082ss.android.ugc.aweme.qrcode.p3657f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66390a;
import com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.f.a */
public class C66407a extends AbstractC66469b {

    /* renamed from: h */
    private Context f149307h;

    /* renamed from: i */
    private TextView f149308i;

    /* renamed from: j */
    private TextView f149309j;

    /* renamed from: k */
    private TextView f149310k;

    /* renamed from: l */
    private View f149311l;

    /* renamed from: m */
    private ImageView f149312m;

    /* renamed from: n */
    private ImageView f149313n;

    /* renamed from: o */
    private C66390a f149314o;

    static {
        Covode.recordClassIndex(77939);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b
    public void setData(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b
    public void setQRCodeCardSubtitleColor(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b
    public void setQRCodeCardTitleColor(int i) {
    }

    public C66390a getQrCodeInfo() {
        return this.f149314o;
    }

    public C66407a(Context context) {
        this(context, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66419a
    /* renamed from: a */
    public final void mo105319a(C66390a aVar) {
        this.f149314o = aVar;
        mo105421b(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66419a
    /* renamed from: a */
    public void mo105320a(Exception exc) {
        C33615a.m68848a(this.f149307h, (Throwable) exc, (int) R.string.g1i);
        mo105422c();
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b
    /* renamed from: a */
    public final void mo105318a(Context context) {
        super.mo105318a(context);
        this.f149307h = context;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bj3, this, true);
        this.f149311l = findViewById(R.id.dc8);
        this.f149313n = (ImageView) findViewById(R.id.a1v);
        this.f149432b = (RemoteImageView) findViewById(R.id.dc7);
        this.f149308i = (TextView) findViewById(R.id.title);
        this.f149309j = (TextView) findViewById(R.id.ajd);
        this.f149310k = (TextView) findViewById(R.id.d_u);
        this.f149312m = (ImageView) findViewById(R.id.cgv);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r0 != 23) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        if (r3 != 23) goto L_0x007e;
     */
    @Override // com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setData(com.p2082ss.android.ugc.aweme.qrcode.C66414j r18) {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.qrcode.p3657f.C66407a.setData(com.ss.android.ugc.aweme.qrcode.j):void");
    }

    private C66407a(Context context, byte b) {
        this(context, (char) 0);
    }

    private C66407a(Context context, char c) {
        super(context, null);
        mo105318a(context);
    }
}
