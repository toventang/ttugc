package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg.C54314c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55340b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4616h.AbstractC89247c;
import p4600h.p4616h.AbstractC89249e;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a */
public abstract class AbstractView$OnClickListenerC54682a extends ActivityC17312a implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f125307a = {new C89225r(AbstractView$OnClickListenerC54682a.class, "mIsMute", "getMIsMute()Z", 0), new C89225r(AbstractView$OnClickListenerC54682a.class, "mIsStickTop", "getMIsStickTop()Z", 0)};

    /* renamed from: b */
    protected ImTextTitleBar f125308b;

    /* renamed from: c */
    public SwitchCompat f125309c;

    /* renamed from: d */
    public SwitchCompat f125310d;

    /* renamed from: e */
    public AbstractC17427b f125311e;

    /* renamed from: f */
    private ViewGroup f125312f;

    /* renamed from: g */
    private TextView f125313g;

    /* renamed from: h */
    private TextView f125314h;

    /* renamed from: i */
    private final AbstractC89249e f125315i = new C54683a(false, false, this);

    /* renamed from: j */
    private final AbstractC89249e f125316j = new C54684b(false, false, this);

    /* renamed from: k */
    private HashMap f125317k;

    static {
        Covode.recordClassIndex(64397);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f125317k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this.f125317k == null) {
            this.f125317k = new HashMap();
        }
        View view = (View) this.f125317k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f125317k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo91710a(boolean z) {
        this.f125315i.mo143655a(f125307a[0], Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final boolean mo91711a() {
        return ((Boolean) this.f125315i.mo23374a(this, f125307a[0])).booleanValue();
    }

    /* renamed from: b */
    public final void mo91712b(boolean z) {
        this.f125316j.mo143655a(f125307a[1], Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final boolean mo91713b() {
        return ((Boolean) this.f125316j.mo23374a(this, f125307a[1])).booleanValue();
    }

    /* renamed from: c */
    public void mo91692c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a$e */
    public static final class C54687e implements ImTextTitleBar.AbstractC55309a {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC54682a f125324a;

        static {
            Covode.recordClassIndex(64402);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91163a(int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: b */
        public final void mo91164b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: c */
        public final void mo91165c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91162a() {
            this.f125324a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54687e(AbstractView$OnClickListenerC54682a aVar) {
            this.f125324a = aVar;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        String str;
        super.onDestroy();
        AbstractC17427b bVar = this.f125311e;
        if (bVar != null) {
            str = bVar.mo27743b();
        } else {
            str = null;
        }
        HashMap<String, Integer> hashMap = C54314c.f124414b;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        C54314c.m99608a(str);
    }

    /* renamed from: e */
    public void mo91694e() {
        TextView textView = this.f125313g;
        if (textView == null) {
            C89219l.m154710a("mMuteText");
        }
        textView.setOnClickListener(this);
        TextView textView2 = this.f125314h;
        if (textView2 == null) {
            C89219l.m154710a("mStickTopText");
        }
        textView2.setOnClickListener(this);
        SwitchCompat switchCompat = this.f125309c;
        if (switchCompat == null) {
            C89219l.m154710a("mMuteSwitch");
        }
        switchCompat.setOnCheckedChangeListener(this);
        SwitchCompat switchCompat2 = this.f125310d;
        if (switchCompat2 == null) {
            C89219l.m154710a("mStickTopSwitch");
        }
        switchCompat2.setOnCheckedChangeListener(this);
        ImTextTitleBar imTextTitleBar = this.f125308b;
        if (imTextTitleBar == null) {
            C89219l.m154710a("mTitleBar");
        }
        imTextTitleBar.setOnTitlebarClickListener(new C54687e(this));
    }

    /* renamed from: d */
    public void mo91693d() {
        int i;
        int i2;
        boolean z;
        C19638h c;
        C19638h c2;
        View findViewById = findViewById(R.id.eiz);
        C89219l.m154716b(findViewById, "");
        this.f125308b = (ImTextTitleBar) findViewById;
        View findViewById2 = findViewById(R.id.c51);
        C89219l.m154716b(findViewById2, "");
        this.f125312f = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(R.id.ezw);
        C89219l.m154716b(findViewById3, "");
        this.f125313g = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.edo);
        C89219l.m154716b(findViewById4, "");
        this.f125309c = (SwitchCompat) findViewById4;
        View findViewById5 = findViewById(R.id.f4h);
        C89219l.m154716b(findViewById5, "");
        this.f125314h = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.edp);
        C89219l.m154716b(findViewById6, "");
        this.f125310d = (SwitchCompat) findViewById6;
        if (C17175b.m31705a()) {
            i = R.color.fg;
        } else {
            i = R.color.ff;
        }
        if (C17175b.m31705a()) {
            i2 = R.color.fe;
        } else {
            i2 = R.color.fd;
        }
        SwitchCompat switchCompat = this.f125309c;
        if (switchCompat == null) {
            C89219l.m154710a("mMuteSwitch");
        }
        switchCompat.setTrackTintList(C0196a.m618a(this, i));
        SwitchCompat switchCompat2 = this.f125309c;
        if (switchCompat2 == null) {
            C89219l.m154710a("mMuteSwitch");
        }
        switchCompat2.setThumbTintList(C0196a.m618a(this, i2));
        SwitchCompat switchCompat3 = this.f125310d;
        if (switchCompat3 == null) {
            C89219l.m154710a("mStickTopSwitch");
        }
        switchCompat3.setTrackTintList(C0196a.m618a(this, i));
        SwitchCompat switchCompat4 = this.f125310d;
        if (switchCompat4 == null) {
            C89219l.m154710a("mStickTopSwitch");
        }
        switchCompat4.setThumbTintList(C0196a.m618a(this, i2));
        AbstractC17427b bVar = this.f125311e;
        boolean z2 = false;
        if (bVar == null || (c2 = bVar.mo27749c()) == null || !c2.isStickTop()) {
            z = false;
        } else {
            z = true;
        }
        mo91712b(z);
        AbstractC17427b bVar2 = this.f125311e;
        if (!(bVar2 == null || (c = bVar2.mo27749c()) == null || !c.isMute())) {
            z2 = true;
        }
        mo91710a(z2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a$c */
    public static final class C54685c implements AbstractC19479b<C19638h> {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC54682a f125322a;

        static {
            Covode.recordClassIndex(64400);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54685c(AbstractView$OnClickListenerC54682a aVar) {
            this.f125322a = aVar;
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C55340b.m101158a(this.f125322a, uVar);
            AbstractView$OnClickListenerC54682a.m100161a(this.f125322a).setChecked(this.f125322a.mo91711a());
            AbstractView$OnClickListenerC54682a.m100161a(this.f125322a).setEnabled(true);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19638h hVar) {
            AbstractView$OnClickListenerC54682a aVar = this.f125322a;
            aVar.mo91710a(!aVar.mo91711a());
            AbstractView$OnClickListenerC54682a.m100161a(this.f125322a).setEnabled(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a$d */
    public static final class C54686d implements AbstractC19479b<C19638h> {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC54682a f125323a;

        static {
            Covode.recordClassIndex(64401);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54686d(AbstractView$OnClickListenerC54682a aVar) {
            this.f125323a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19638h hVar) {
            AbstractView$OnClickListenerC54682a aVar = this.f125323a;
            aVar.mo91712b(!aVar.mo91713b());
            AbstractView$OnClickListenerC54682a.m100163b(this.f125323a).setEnabled(true);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C89219l.m154721d(uVar, "");
            C55340b.m101158a(this.f125323a, uVar);
            AbstractView$OnClickListenerC54682a.m100163b(this.f125323a).setChecked(this.f125323a.mo91713b());
            AbstractView$OnClickListenerC54682a.m100163b(this.f125323a).setEnabled(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a$f */
    public static final class C54688f extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C54688f f125325a = new C54688f();

        static {
            Covode.recordClassIndex(64403);
        }

        C54688f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C546891.f125326a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SwitchCompat m100161a(AbstractView$OnClickListenerC54682a aVar) {
        SwitchCompat switchCompat = aVar.f125309c;
        if (switchCompat == null) {
            C89219l.m154710a("mMuteSwitch");
        }
        return switchCompat;
    }

    /* renamed from: b */
    public static final /* synthetic */ SwitchCompat m100163b(AbstractView$OnClickListenerC54682a aVar) {
        SwitchCompat switchCompat = aVar.f125310d;
        if (switchCompat == null) {
            C89219l.m154710a("mStickTopSwitch");
        }
        return switchCompat;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        activityConfiguration(C54688f.f125325a);
        super.onCreate(bundle);
        setContentView(R.layout.a46);
        C55076b.m100725d().setupStatusBar(this);
        mo91692c();
        mo91693d();
        mo91694e();
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        int id = view.getId();
        if (id == R.id.ezw) {
            SwitchCompat switchCompat = this.f125309c;
            if (switchCompat == null) {
                C89219l.m154710a("mMuteSwitch");
            }
            SwitchCompat switchCompat2 = this.f125309c;
            if (switchCompat2 == null) {
                C89219l.m154710a("mMuteSwitch");
            }
            switchCompat.setChecked(!switchCompat2.isChecked());
        } else if (id == R.id.f4h) {
            SwitchCompat switchCompat3 = this.f125310d;
            if (switchCompat3 == null) {
                C89219l.m154710a("mStickTopSwitch");
            }
            SwitchCompat switchCompat4 = this.f125310d;
            if (switchCompat4 == null) {
                C89219l.m154710a("mStickTopSwitch");
            }
            switchCompat3.setChecked(!switchCompat4.isChecked());
        }
    }

    /* renamed from: a */
    private final void m100162a(boolean z, String str) {
        String str2;
        C19638h c;
        C19638h c2;
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        AbstractC17427b bVar = this.f125311e;
        String str3 = null;
        if (bVar == null || (c2 = bVar.mo27749c()) == null || c2.getConversationType() != C19489e.AbstractC19490a.f46181b) {
            AbstractC17427b bVar2 = this.f125311e;
            if (bVar2 != null && (c = bVar2.mo27749c()) != null && c.getConversationType() == C19489e.AbstractC19490a.f46180a) {
                AbstractC17427b bVar3 = this.f125311e;
                if (bVar3 != null) {
                    str3 = bVar3.mo27743b();
                }
                C55059b.m100695b(str3, "private", str2, str);
                return;
            }
            return;
        }
        AbstractC17427b bVar4 = this.f125311e;
        if (bVar4 != null) {
            str3 = bVar4.mo27743b();
        }
        C55059b.m100695b(str3, "group", str2, str);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton != null) {
            int id = compoundButton.getId();
            if (id == R.id.edo) {
                if (z != mo91711a()) {
                    SwitchCompat switchCompat = this.f125309c;
                    if (switchCompat == null) {
                        C89219l.m154710a("mMuteSwitch");
                    }
                    switchCompat.setEnabled(false);
                    m100162a(!mo91711a(), "chat_mute_click");
                    AbstractC17427b bVar = this.f125311e;
                    if (bVar != null) {
                        bVar.mo27748b(!mo91711a(), new C54685c(this));
                    }
                }
            } else if (id == R.id.edp && z != mo91713b()) {
                SwitchCompat switchCompat2 = this.f125310d;
                if (switchCompat2 == null) {
                    C89219l.m154710a("mStickTopSwitch");
                }
                switchCompat2.setEnabled(false);
                m100162a(!mo91713b(), "chat_top_click");
                AbstractC17427b bVar2 = this.f125311e;
                if (bVar2 != null) {
                    bVar2.mo27742a(!mo91713b(), new C54686d(this));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a$a */
    public static final class C54683a extends AbstractC89247c<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f125318a;

        /* renamed from: b */
        final /* synthetic */ AbstractView$OnClickListenerC54682a f125319b;

        static {
            Covode.recordClassIndex(64398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54683a(Object obj, Object obj2, AbstractView$OnClickListenerC54682a aVar) {
            super(obj2);
            this.f125318a = obj;
            this.f125319b = aVar;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, Boolean bool, Boolean bool2) {
            C89219l.m154721d(iVar, "");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (AbstractView$OnClickListenerC54682a.m100161a(this.f125319b).isChecked() ^ booleanValue) {
                AbstractView$OnClickListenerC54682a.m100161a(this.f125319b).setChecked(booleanValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a$b */
    public static final class C54684b extends AbstractC89247c<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f125320a;

        /* renamed from: b */
        final /* synthetic */ AbstractView$OnClickListenerC54682a f125321b;

        static {
            Covode.recordClassIndex(64399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54684b(Object obj, Object obj2, AbstractView$OnClickListenerC54682a aVar) {
            super(obj2);
            this.f125320a = obj;
            this.f125321b = aVar;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, Boolean bool, Boolean bool2) {
            C89219l.m154721d(iVar, "");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (AbstractView$OnClickListenerC54682a.m100163b(this.f125321b).isChecked() ^ booleanValue) {
                AbstractView$OnClickListenerC54682a.m100163b(this.f125321b).setChecked(booleanValue);
            }
        }
    }
}
