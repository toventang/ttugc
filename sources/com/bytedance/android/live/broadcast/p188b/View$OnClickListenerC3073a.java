package com.bytedance.android.live.broadcast.p188b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.utils.C3717b;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBroadcastGuideStrategySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsHelpPageSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.AbstractDialogC11425g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.broadcast.b.a */
public final class View$OnClickListenerC3073a extends AbstractDialogC11425g implements View.OnClickListener {

    /* renamed from: a */
    public boolean f8912a;

    /* renamed from: b */
    String f8913b;

    /* renamed from: c */
    private String f8914c;

    /* renamed from: d */
    private String f8915d;

    /* renamed from: e */
    private String f8916e;

    /* renamed from: f */
    private String f8917f;

    /* renamed from: g */
    private TextView f8918g;

    /* renamed from: h */
    private TextView f8919h;

    /* renamed from: j */
    private TextView f8920j;

    /* renamed from: k */
    private TextView f8921k;

    /* renamed from: l */
    private TextView f8922l;

    /* renamed from: m */
    private TextView f8923m;

    /* renamed from: n */
    private TextView f8924n;

    /* renamed from: o */
    private TextView f8925o;

    /* renamed from: p */
    private TextView f8926p;

    /* renamed from: q */
    private TextView f8927q;

    /* renamed from: r */
    private Room f8928r;

    /* renamed from: s */
    private LinearLayout f8929s;

    /* renamed from: t */
    private TextView f8930t;

    /* renamed from: u */
    private AbstractC88412b f8931u;

    /* renamed from: v */
    private Context f8932v;

    static {
        Covode.recordClassIndex(3553);
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    /* renamed from: b */
    public final int mo8350b() {
        return R.layout.b5d;
    }

    public final void show() {
        mo8349a();
        super.show();
    }

    /* renamed from: c */
    public final void mo8351c() {
        AbstractC88412b bVar = this.f8931u;
        if (bVar != null && !bVar.isDisposed()) {
            this.f8931u.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8349a() {
        if (this.f8930t != null && !TextUtils.isEmpty(this.f8913b) && !TextUtils.equals(this.f8930t.getText(), this.f8913b)) {
            this.f8930t.setText(this.f8913b);
        }
    }

    /* renamed from: a */
    private void m8410a(boolean z) {
        String str;
        String idStr;
        String str2;
        if (z) {
            str = "livesdk_server_url_copy";
        } else {
            str = "livesdk_stream_key_copy";
        }
        C6501b a = C6501b.C6502a.m13948a(str);
        Room room = this.f8928r;
        if (room == null) {
            idStr = "";
        } else {
            idStr = room.getIdStr();
        }
        C6501b a2 = a.mo12651a("room_id", idStr);
        if (this.f8912a) {
            str2 = "live_start";
        } else {
            str2 = "live_room";
        }
        a2.mo12651a("request_page", str2).mo12655b();
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.bet) {
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = getContext();
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b(this.f8914c);
            b.f17378b = C3966y.m9657a((int) R.string.gpb);
            webViewManager.mo13248a(context, b);
            C6501b.C6502a.m13948a("thirdparty_take_guide").mo12639a().mo12654b("live").mo12656c("click").mo12651a("request_page", "live_room").mo12655b();
        } else if (id == R.id.dw8) {
            m8409a(this.f8916e, true, PrivacyCert.Builder.with("bpea-211").usage("In the OBS scenario, the user needs to copy the push url and key to the clipboard, and then push the stream on the computer.").tag("copy_server_url").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
        } else if (id == R.id.dw3) {
            m8409a(this.f8917f, false, PrivacyCert.Builder.with("bpea-212").usage("In the OBS scenario, the user needs to copy the push url and key to the clipboard, and then push the stream on the computer.").tag("copy_server_key").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8914c = LiveObsHelpPageSetting.INSTANCE.getValue();
        int lastIndexOf = this.f8915d.lastIndexOf("/");
        if (lastIndexOf == -1) {
            String str = this.f8915d;
            this.f8917f = str;
            this.f8916e = str;
        } else {
            int i = lastIndexOf + 1;
            this.f8916e = this.f8915d.substring(0, i);
            this.f8917f = this.f8915d.substring(i);
        }
        this.f8918g = (TextView) findViewById(R.id.title_tv);
        this.f8919h = (TextView) findViewById(R.id.bet);
        this.f8920j = (TextView) findViewById(R.id.dw9);
        this.f8921k = (TextView) findViewById(R.id.dw4);
        this.f8922l = (TextView) findViewById(R.id.dw8);
        this.f8923m = (TextView) findViewById(R.id.dw3);
        this.f8924n = (TextView) findViewById(R.id.dvz);
        this.f8925o = (TextView) findViewById(R.id.dw0);
        this.f8926p = (TextView) findViewById(R.id.dw1);
        this.f8927q = (TextView) findViewById(R.id.dw2);
        this.f8929s = (LinearLayout) findViewById(R.id.dw6);
        this.f8930t = (TextView) findViewById(R.id.dw7);
        this.f8919h.setOnClickListener(this);
        this.f8922l.setOnClickListener(this);
        this.f8923m.setOnClickListener(this);
        this.f8920j.setText(this.f8916e);
        this.f8921k.setText(this.f8917f);
        if (LiveObsBroadcastGuideStrategySetting.INSTANCE.getValue() == 1) {
            this.f8927q.setVisibility(0);
        }
        Context context = this.f8932v;
        if (context instanceof Activity) {
            this.f8913b = m8408a(C11279p.m20001a(context).getIntent(), "live.intent.extra.LIVE_PC_TIPS");
        }
        if (TextUtils.isEmpty(this.f8913b)) {
            this.f8913b = getContext().getString(R.string.emf);
            mo8349a();
            this.f8931u = C3719d.C3720a.m9229a().mo9038a().getPreviewRoomCreateInfo(0).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3074b(this), new C3075c(this));
            return;
        }
        mo8349a();
    }

    /* renamed from: a */
    private static String m8408a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public View$OnClickListenerC3073a(Context context, String str, Room room) {
        super(context);
        this.f8932v = context;
        this.f8915d = str;
        this.f8928r = room;
    }

    /* renamed from: a */
    private void m8409a(String str, boolean z, PrivacyCert privacyCert) {
        int i;
        try {
            C3717b.m9222a(str, privacyCert);
            if (z) {
                i = R.string.ek5;
            } else {
                i = R.string.ekm;
            }
            C11226ao.m19882a(C3966y.m9669e(), i);
            m8410a(z);
        } catch (Exception unused) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gmc);
        }
    }
}
