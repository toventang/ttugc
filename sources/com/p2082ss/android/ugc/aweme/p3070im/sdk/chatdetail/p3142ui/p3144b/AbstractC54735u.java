package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.AbstractC1973t;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.widget.setting.checkable.DmtSettingSwitch;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55233v;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.u */
public abstract class AbstractC54735u extends AbstractC1973t<C54737b> {

    /* renamed from: k */
    public static final C54736a f125466k = new C54736a((byte) 0);

    /* renamed from: h */
    public int f125467h;

    /* renamed from: i */
    public boolean f125468i = true;

    /* renamed from: j */
    public View.OnClickListener f125469j;

    static {
        Covode.recordClassIndex(64450);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: b */
    public final int mo5792b() {
        return R.layout.a86;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.u$a */
    public static final class C54736a {
        static {
            Covode.recordClassIndex(64451);
        }

        private C54736a() {
        }

        public /* synthetic */ C54736a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo5788a(C54737b bVar) {
        C89219l.m154721d(bVar, "");
        ((TextView) bVar.f125471b.mo23374a(bVar, C54737b.f125470a[0])).setText(this.f125467h);
        bVar.mo91779b().setChecked(this.f125468i);
        bVar.mo91720a().setOnClickListener(this.f125469j);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.u$b */
    public static final class C54737b extends AbstractC54694c {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f125470a = {new C89232y(C54737b.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new C89232y(C54737b.class, "switch", "getSwitch()Lcom/bytedance/ies/dmt/ui/widget/setting/checkable/DmtSettingSwitch;", 0)};

        /* renamed from: b */
        final AbstractC89248d f125471b = m100198a((int) R.id.bkj);

        /* renamed from: c */
        private final AbstractC89248d f125472c = m100198a((int) R.id.bki);

        static {
            Covode.recordClassIndex(64452);
        }

        /* renamed from: b */
        public final DmtSettingSwitch mo91779b() {
            return (DmtSettingSwitch) this.f125472c.mo23374a(this, f125470a[1]);
        }

        @Override // com.airbnb.epoxy.AbstractC1954q, com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54694c
        /* renamed from: a */
        public final void mo5782a(View view) {
            int i;
            C89219l.m154721d(view, "");
            super.mo5782a(view);
            DmtSettingSwitch b = mo91779b();
            b.setTrackRadius((int) C13628n.m24520b(b.getContext(), 42.0f));
            b.setEnableTouch(false);
            b.setTrackPadding((int) C13628n.m24520b(b.getContext(), 3.0f));
            b.setThumbDrawable(b.getResources().getDrawable(R.drawable.cdu));
            Context context = b.getContext();
            C89219l.m154716b(context, "");
            C89219l.m154721d(context, "");
            Resources resources = context.getResources();
            if (C17175b.m31708b(context)) {
                i = R.color.fi;
            } else {
                i = R.color.fh;
            }
            b.setTrackTintList(resources.getColorStateList(i));
            C55233v.m101004a(view);
        }
    }
}
