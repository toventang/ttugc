package com.p2082ss.android.ugc.aweme.bullet;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.AbstractC13615f;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.p1184ui.common.p1188d.C17039d;
import com.bytedance.ies.bullet.p1184ui.common.view.C17057a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16746t;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16742r;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tux.p1721g.C23147d;
import com.google.android.play.core.p1965d.C26975a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34469d;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34474i;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38659ay;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38754l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40565d;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51429c;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c;
import com.p2082ss.android.ugc.aweme.p2431bz.C35332a;
import com.p2082ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80416ez;
import com.p2082ss.android.ugc.aweme.utils.C80517gw;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.BulletContainerActivity */
public class BulletContainerActivity extends AbstractActivityC17000a implements AbstractC13615f, AbstractC34471f, AbstractC34472g {

    /* renamed from: l */
    public boolean f82439l;

    /* renamed from: m */
    private C51429c f82440m;

    /* renamed from: n */
    private AbstractC34467b f82441n;

    /* renamed from: o */
    private C16721b f82442o;

    /* renamed from: p */
    private List<AbstractC34466a> f82443p;

    /* renamed from: q */
    private final AbstractC16239d.AbstractC16241b f82444q = C34963b.m71411a().mo61850a();

    /* renamed from: r */
    private long f82445r;

    /* renamed from: s */
    private boolean f82446s;

    /* renamed from: t */
    private String f82447t;

    /* renamed from: u */
    private SparseArray f82448u;

    static {
        Covode.recordClassIndex(41974);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: a */
    public View mo26864a(int i) {
        if (this.f82448u == null) {
            this.f82448u = new SparseArray();
        }
        View view = (View) this.f82448u.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82448u.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: a */
    public final View mo26865a(ViewGroup viewGroup, Uri uri) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(uri, "");
        return null;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17050j
    /* renamed from: s */
    public final AbstractC16239d.AbstractC16241b mo26917s() {
        return this.f82444q;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: j */
    public final AbstractC17051k.AbstractC17053b mo26874j() {
        return new C17057a();
    }

    /* renamed from: x */
    private final boolean m71351x() {
        return getIntent().getBooleanExtra("from_promote_live", false);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: i */
    public final CharSequence mo26873i() {
        String string = getString(R.string.g1y);
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: k */
    public final View mo26875k() {
        return BulletService.m71938f().mo61849a(this);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: l */
    public final boolean mo26876l() {
        mo26871g().mo26846c();
        return true;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: m */
    public final boolean mo26877m() {
        mo26871g().mo26847d();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int mo61827v() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getIntExtra("activity_translation_type", 0);
        }
        return 0;
    }

    /* renamed from: w */
    private final boolean m71350w() {
        if (isFinishing()) {
            return false;
        }
        if (this.f82440m != null) {
            return true;
        }
        C51429c cVar = new C51429c(this);
        this.f82440m = cVar;
        cVar.f118510g = false;
        return true;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: n */
    public final void mo26878n() {
        if (getIntent().getBooleanExtra("from_promote_live", false)) {
            C17039d.m31499a(this, getWindow(), false);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C51429c cVar = this.f82440m;
        if (cVar != null) {
            cVar.mo86850a();
        }
        AbstractC81915c.m141874a(new C40565d(System.currentTimeMillis() - this.f82445r));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        C51429c cVar = this.f82440m;
        if (cVar != null) {
            cVar.mo86854b();
        }
        C23147d.m43622b(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onResume", true);
        super.onResume();
        C51429c cVar = this.f82440m;
        if (cVar != null) {
            cVar.f118509f = false;
        }
        this.f82439l = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public void finish() {
        AbstractC16725d<Boolean> dVar;
        C38754l.m78608a(this);
        super.finish();
        Boolean bool = null;
        C38659ay.f91340a = null;
        if (!m71351x()) {
            C16721b bVar = this.f82442o;
            if (!(bVar == null || (dVar = bVar.f39915F) == null)) {
                bool = dVar.mo26550b();
            }
            if (!C89219l.m154714a((Object) bool, (Object) true)) {
                C34469d.m70450a(this, mo61827v(), false);
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C53438a.m98620a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f
    public void setActivityResultListener(AbstractC34467b bVar) {
        C89219l.m154721d(bVar, "");
        this.f82441n = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public void unRegisterActivityOnKeyDownListener(AbstractC34466a aVar) {
        C89219l.m154721d(aVar, "");
        List<AbstractC34466a> list = this.f82443p;
        if (list != null) {
            list.remove(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C35332a.m72316a(context);
        Context b = C53457c.m98656b(context);
        C26975a.m53596a(b, false);
        IPluginService d = AabPluginServiceImpl.m114069d();
        C89219l.m154716b(d, "");
        d.mo28893c().mo28895a(b);
        super.attachBaseContext(b);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public void registerActivityOnKeyDownListener(AbstractC34466a aVar) {
        C89219l.m154721d(aVar, "");
        if (this.f82443p == null) {
            this.f82443p = new ArrayList();
        }
        List<AbstractC34466a> list = this.f82443p;
        if (list != null && !list.contains(aVar)) {
            list.add(aVar);
        }
    }

    /* renamed from: b */
    private final void m71349b(int i) {
        if (!this.f82446s && this.f82447t != null) {
            JSONObject jSONObject = new JSONObject(this.f82447t);
            try {
                jSONObject.put("status", String.valueOf(i)).put("duration", System.currentTimeMillis() - this.f82445r);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C39162r.m79461a("request_anchor_detail", jSONObject);
            this.f82446s = true;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        String str;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onCreate", true);
        Intent intent = getIntent();
        Uri uri = null;
        if (intent != null) {
            str = m71348a(intent, "resso_key");
        } else {
            str = null;
        }
        this.f82447t = str;
        this.f82445r = System.currentTimeMillis();
        if (getIntent().getBooleanExtra("from_promote_live", false)) {
            setTheme(R.style.oj);
            C34474i.m70452a(this);
        }
        this.f40506h = true;
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("from_promote_live", false)) {
            mo26879o();
            overridePendingTransition(0, 0);
        }
        getLifecycle().mo4012a(new BulletEventObserver(((AbstractActivityC17000a) this).f40500b, this));
        C80517gw a = C80517gw.m139563a();
        Intent intent2 = getIntent();
        if (intent2 != null) {
            uri = intent2.getData();
        }
        a.mo123771a(uri);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onCreate", false);
        C53438a.m98620a(this);
    }

    /* renamed from: a */
    private static String m71348a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.common.utility.AbstractC13615f
    public void showCustomLongToast(int i, String str) {
        C51429c cVar;
        C89219l.m154721d(str, "");
        if (m71350w() && (cVar = this.f82440m) != null) {
            cVar.mo86851a(i, str);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(th, "");
        super.mo25852a(uri, th);
        m71349b(0);
    }

    @Override // androidx.appcompat.app.ActivityC0218d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        List<AbstractC34466a> list = this.f82443p;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC34467b bVar = this.f82441n;
        if (bVar != null) {
            bVar.mo60905a(i, i2, intent);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        super.mo25853a(view, uri, iVar);
        m71349b(1);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: a */
    public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(qVar, "");
        super.mo25854a(iVar, uri, qVar);
        if (qVar instanceof C16721b) {
            C16721b bVar = (C16721b) qVar;
            this.f82442o = bVar;
            if (!m71351x() && (!C89219l.m154714a((Object) bVar.f39915F.mo26550b(), (Object) true))) {
                C34469d.m70450a(this, mo61827v(), true);
            }
        }
    }

    @Override // com.bytedance.common.utility.AbstractC13615f
    public void showCustomToast(int i, String str, int i2, int i3) {
        C51429c cVar;
        C89219l.m154721d(str, "");
        if (m71350w() && (cVar = this.f82440m) != null) {
            cVar.mo86852a(i, str, i2);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C16746t b;
        AbstractC16725d<Boolean> dVar;
        AbstractC16725d<Boolean> dVar2;
        C89219l.m154721d(list, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        super.mo25855a(list, uri, iVar, z);
        if (iVar.mo25769b() == EnumC16723b.RN) {
            C16721b bVar = this.f82442o;
            if (!(bVar == null || (dVar2 = bVar.f39912C) == null)) {
                dVar2.mo26549a((Boolean) true);
            }
            C16721b bVar2 = this.f82442o;
            if (!(bVar2 == null || (dVar = bVar2.f39927c) == null)) {
                dVar.mo26549a((Boolean) true);
            }
            mo26879o();
        }
        C16721b bVar3 = this.f82442o;
        if (bVar3 != null && bVar3.f39930f.mo26550b() == EnumC16742r.AUTO && (b = bVar3.f39929e.mo26550b()) != null && b.f39989a == -2) {
            C89219l.m154721d(this, "");
            C80416ez.m139401a(this, C0643b.m2378c(this, R.color.bz));
        }
    }
}
