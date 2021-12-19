package com.bytedance.android.livesdk.p442ai;

import android.content.Context;
import com.bytedance.android.live.p250i.p252b.C4365d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p379n.AbstractC5778k;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p492g.C7572d;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.ai.k */
public final class C6737k implements AbstractC5778k {

    /* renamed from: a */
    public static final String f16716a = C89204ab.m154669a(C6737k.class).mo143613b();

    /* renamed from: b */
    public static AbstractC5778k f16717b = new C6737k();

    /* renamed from: c */
    public static final C6738a f16718c = new C6738a((byte) 0);

    /* renamed from: d */
    private HashMap<String, AbstractC5777j> f16719d = new HashMap<>();

    /* renamed from: e */
    private AbstractC5777j f16720e;

    /* renamed from: f */
    private final boolean f16721f = LiveMultiPlayerEnableSetting.INSTANCE.getValue();

    /* renamed from: com.bytedance.android.livesdk.ai.k$a */
    public static final class C6738a {
        static {
            Covode.recordClassIndex(7476);
        }

        private C6738a() {
        }

        public /* synthetic */ C6738a(byte b) {
            this();
        }
    }

    private C6737k() {
    }

    static {
        Covode.recordClassIndex(7475);
    }

    /* renamed from: b */
    private static AbstractC5777j m14377b() {
        C6730i iVar = new C6730i(((IHostContext) C6193a.m13435a(IHostContext.class)).context(), (IHostPlugin) C6193a.m13435a(IHostPlugin.class), new C6740m());
        C7572d.m15561a(f16716a, "create playController -> playController: " + iVar.hashCode());
        return iVar;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5778k
    /* renamed from: a */
    public final AbstractC5777j mo11548a() {
        int i;
        String str = f16716a;
        StringBuilder sb = new StringBuilder("get current playController -> playController:");
        AbstractC5777j jVar = this.f16720e;
        if (jVar != null) {
            i = jVar.hashCode();
        } else {
            i = 0;
        }
        C7572d.m15561a(str, sb.append(i).toString());
        return this.f16720e;
    }

    /* renamed from: e */
    private final AbstractC5777j m14378e(String str) {
        AbstractC5777j f = m14379f(str);
        if (f != null) {
            return f;
        }
        AbstractC5777j b = m14377b();
        this.f16719d.put(str, b);
        return b;
    }

    /* renamed from: f */
    private final AbstractC5777j m14379f(String str) {
        if (this.f16719d.containsKey(str)) {
            return this.f16719d.get(str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5778k
    /* renamed from: c */
    public final void mo11554c(String str) {
        AbstractC5777j f;
        if (!this.f16721f) {
            this.f16720e = C4365d.m10462g().mo10110a();
        } else if (str != null && (f = m14379f(str)) != null) {
            this.f16720e = f;
            C7572d.m15561a(f16716a, "set current player " + str + " --> " + f);
            f.mo11531a(false, str);
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5778k
    /* renamed from: d */
    public final void mo11555d(String str) {
        C89219l.m154721d(str, "");
        if (this.f16721f && m14379f(str) != null) {
            C7572d.m15561a(f16716a, "clear cache --> ".concat(String.valueOf(this.f16719d.remove(str))));
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5778k
    /* renamed from: a */
    public final AbstractC5777j mo11549a(String str) {
        int i;
        String str2 = f16716a;
        C7572d.m15561a(str2, "wanna getPlayerController ->  tag: ".concat(String.valueOf(str)));
        if (!this.f16721f) {
            return C4365d.m10462g().mo10110a();
        }
        if (str == null) {
            return null;
        }
        StringBuilder append = new StringBuilder().append(str).append(" matches ---> LivePlayController: ");
        AbstractC5777j e = m14378e(str);
        if (e != null) {
            i = e.hashCode();
        } else {
            i = 0;
        }
        C7572d.m15561a(str2, append.append(i).toString());
        return m14378e(str);
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5778k
    /* renamed from: b */
    public final AbstractC5777j mo11553b(String str) {
        int i;
        if (!this.f16721f) {
            return C4365d.m10462g().mo10110a();
        }
        if (str == null) {
            return null;
        }
        AbstractC5777j f = m14379f(str);
        String str2 = f16716a;
        StringBuilder append = new StringBuilder().append(str).append("  getPlayerController from cache: ");
        if (f != null) {
            i = f.hashCode();
        } else {
            i = 0;
        }
        C7572d.m15561a(str2, append.append(i).toString());
        return f;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5778k
    /* renamed from: a */
    public final void mo11550a(Context context) {
        String key;
        if (this.f16721f) {
            Iterator<Map.Entry<String, AbstractC5777j>> it = this.f16719d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, AbstractC5777j> next = it.next();
                AbstractC5777j value = next.getValue();
                C7572d.m15561a(f16716a, "releaseAllMultiPlayer()，" + next.getKey() + " delete ");
                if ((next.getKey() == null || (key = next.getKey()) == null || !C89361p.m154929e((CharSequence) key, (CharSequence) "preview")) && value.mo12916c(context)) {
                    it.remove();
                }
            }
            this.f16720e = null;
            return;
        }
        C4365d.m10462g().mo10110a().mo12916c(((IHostContext) C6193a.m13435a(IHostContext.class)).context());
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5778k
    /* renamed from: a */
    public final void mo11551a(String str, AbstractC5777j jVar) {
        C89219l.m154721d(jVar, "");
        if (this.f16721f && str != null && m14379f(str) == null) {
            this.f16719d.put(str, jVar);
            C7572d.m15561a(f16716a, "reuse player -> cache PlayerTag : " + str + " into newLivePlayController: " + jVar.hashCode());
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5778k
    /* renamed from: a */
    public final void mo11552a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (this.f16721f) {
            AbstractC5777j f = m14379f(str);
            if (f != null) {
                this.f16719d.remove(str);
                this.f16719d.put(str2, f);
            }
            C7572d.m15561a(f16716a, "reuse playController -> replace reusePlayerTag: " + str + "  into roomPlayerTag: " + str2);
        }
    }
}
