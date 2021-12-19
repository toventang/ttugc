package com.bytedance.android.livesdk.chatroom.widget;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p561j.C9075cn;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class ScreenRecordStatusWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: a */
    public boolean f20236a;

    /* renamed from: b */
    private TextView f20237b;

    /* renamed from: c */
    private TextView f20238c;

    /* renamed from: d */
    private TextView f20239d;

    /* renamed from: e */
    private ArrayList<String> f20240e = new ArrayList<>();

    /* renamed from: f */
    private boolean f20241f = true;

    static {
        Covode.recordClassIndex(8982);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b4s;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        if (!this.f20236a && this.f20241f) {
            super.show();
        }
    }

    /* renamed from: a */
    public final void mo14388a(boolean z) {
        this.f20241f = z;
        if (z) {
            show();
        } else {
            hide();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget$a */
    static final class C8162a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ScreenRecordStatusWidget f20242a;

        static {
            Covode.recordClassIndex(8983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8162a(ScreenRecordStatusWidget screenRecordStatusWidget) {
            super(1);
            this.f20242a = screenRecordStatusWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            this.f20242a.f20236a = booleanValue;
            if (booleanValue) {
                this.f20242a.hide();
            } else {
                this.f20242a.show();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        TextView textView = this.f20237b;
        if (textView == null) {
            C89219l.m154710a("titleTextView");
        }
        textView.setText(C3966y.m9657a((int) R.string.eik));
        TextView textView2 = this.f20238c;
        if (textView2 == null) {
            C89219l.m154710a("contentTextView");
        }
        textView2.setText(C3966y.m9657a((int) R.string.eij));
        TextView textView3 = this.f20239d;
        if (textView3 == null) {
            C89219l.m154710a("startButton");
        }
        textView3.setVisibility(8);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        String str;
        Resources resources;
        String[] strArr = new String[1];
        View view = getView();
        if (view == null || (resources = view.getResources()) == null || (str = resources.getString(R.string.ei3)) == null) {
            str = "";
        }
        C89219l.m154716b(str, "");
        strArr[0] = str;
        this.f20240e = C89070n.m154525d(strArr);
        View findViewById = findViewById(R.id.ejq);
        C89219l.m154716b(findViewById, "");
        this.f20237b = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.adu);
        C89219l.m154716b(findViewById2, "");
        this.f20238c = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.e6i);
        C89219l.m154716b(findViewById3, "");
        this.f20239d = (TextView) findViewById3;
        this.dataChannel.mo28309a((AbstractC1204m) this, C9075cn.class, (AbstractC89172b) new C8162a(this));
    }
}
