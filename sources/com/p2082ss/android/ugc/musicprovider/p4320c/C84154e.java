package com.p2082ss.android.ugc.musicprovider.p4320c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60755b;
import com.p2082ss.android.ugc.aweme.music.p3470e.C60768e;
import com.p2082ss.android.ugc.aweme.music.p3470e.C60779h;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b.C61135b;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b.C61136c;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84160a;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84161b;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c;
import com.p2082ss.android.ugc.musicprovider.p4318a.C84126a;
import com.p2082ss.ttvideoengine.C86313ai;
import com.toutiao.proxyserver.C87385v;
import com.toutiao.proxyserver.p4489a.C87284a;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.musicprovider.c.e */
public final class C84154e implements AbstractC61066c {

    /* renamed from: b */
    public static final C84155a f187812b = new C84155a((byte) 0);

    /* renamed from: a */
    public AbstractC84161b f187813a;

    /* renamed from: c */
    private C86313ai f187814c;

    /* renamed from: d */
    private AbstractC84162c f187815d;

    /* renamed from: e */
    private AbstractC84160a f187816e;

    /* renamed from: f */
    private long f187817f;

    /* renamed from: g */
    private C84126a f187818g;

    /* renamed from: h */
    private AbstractC60755b f187819h;

    /* renamed from: i */
    private final String f187820i;

    static {
        Covode.recordClassIndex(98053);
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.e$a */
    public static final class C84155a {
        static {
            Covode.recordClassIndex(98054);
        }

        private C84155a() {
        }

        public /* synthetic */ C84155a(byte b) {
            this();
        }
    }

    private /* synthetic */ C84154e() {
        this("");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.musicprovider.c.e$b */
    public static final class RunnableC84156b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C84154e f187821a;

        static {
            Covode.recordClassIndex(98055);
        }

        RunnableC84156b(C84154e eVar) {
            this.f187821a = eVar;
        }

        public final void run() {
            AbstractC84161b bVar = this.f187821a.f187813a;
            if (bVar != null) {
                bVar.mo63052a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98585a() {
        try {
            AbstractC60755b bVar = this.f187819h;
            if (bVar != null) {
                bVar.mo98169a();
            }
            C86313ai aiVar = this.f187814c;
            if (aiVar != null) {
                aiVar.mo137255l();
            }
            C86313ai aiVar2 = this.f187814c;
            if (aiVar2 != null) {
                aiVar2.mo137258m();
            }
        } catch (Exception e) {
            m144715a(e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: b */
    public final void mo98590b() {
        try {
            AbstractC60755b bVar = this.f187819h;
            if (bVar != null) {
                bVar.mo98169a();
            }
            C86313ai aiVar = this.f187814c;
            if (aiVar != null) {
                aiVar.mo137255l();
            }
        } catch (Exception e) {
            m144715a(e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: d */
    public final void mo98592d() {
        try {
            AbstractC60755b bVar = this.f187819h;
            if (bVar != null) {
                bVar.mo98169a();
            }
            C86313ai aiVar = this.f187814c;
            if (aiVar != null) {
                aiVar.mo137251k();
            }
        } catch (Exception e) {
            m144715a(e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: c */
    public final void mo98591c() {
        try {
            mo98585a();
            C86313ai aiVar = this.f187814c;
            if (aiVar != null) {
                aiVar.mo137258m();
            }
            this.f187814c = null;
            C84145d dVar = C84145d.f187790j;
            AbstractC84162c cVar = this.f187815d;
            if (cVar != null && C89219l.m154714a(dVar.f187799h, cVar)) {
                dVar.f187799h = null;
            }
            C84145d dVar2 = C84145d.f187790j;
            AbstractC84160a aVar = this.f187816e;
            if (aVar != null && C89219l.m154714a(dVar2.f187798g, aVar)) {
                dVar2.f187798g = null;
            }
            C84145d dVar3 = C84145d.f187790j;
            AbstractC84161b bVar = this.f187813a;
            if (bVar != null && C89219l.m154714a(dVar3.f187797f, bVar)) {
                dVar3.f187797f = null;
            }
            C84145d.f187790j.f187796e = "";
        } catch (Exception e) {
            m144715a(e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98587a(AbstractC84160a aVar) {
        this.f187816e = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98588a(AbstractC84161b bVar) {
        this.f187813a = bVar;
    }

    /* renamed from: a */
    private final void m144715a(Exception exc) {
        m144716b(exc);
        C84145d.f187790j.mo128970a(new RunnableC84156b(this));
    }

    public C84154e(String str) {
        this.f187820i = str;
        C84145d dVar = C84145d.f187790j;
        if (dVar.f187792a == null) {
            dVar.f187792a = new C86313ai(C17867d.m33078a(), 0);
            C86313ai aiVar = dVar.f187792a;
            if (aiVar != null) {
                aiVar.mo137173a(dVar.f187800i);
            }
        }
        this.f187814c = dVar.f187792a;
        this.f187819h = C60779h.m110324a();
    }

    /* renamed from: b */
    private final void m144716b(Exception exc) {
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f187817f;
        C84126a aVar = this.f187818g;
        if (aVar != null && exc != null) {
            String obj = aVar.f187737b.toString();
            C86313ai aiVar = this.f187814c;
            String str2 = null;
            if (aiVar != null) {
                str = aiVar.mo137266r();
            } else {
                str = null;
            }
            C61136c.m110752a(-1, elapsedRealtime, obj, str, exc.getMessage(), this.f187820i);
            String str3 = aVar.f187741f;
            String obj2 = aVar.f187737b.toString();
            C86313ai aiVar2 = this.f187814c;
            if (aiVar2 != null) {
                str2 = aiVar2.mo137266r();
            }
            C61135b.m110750a(str3, obj2, str2, exc.getMessage());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98589a(AbstractC84162c cVar) {
        this.f187815d = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98586a(C84126a aVar, boolean z) {
        C86313ai aiVar;
        C89219l.m154721d(aVar, "");
        try {
            AbstractC60755b bVar = this.f187819h;
            if (bVar != null) {
                bVar.mo98169a();
            }
            C87284a.C87285a.f197841a.f197839a.set(1);
            C87284a.C87285a.f197841a.f197840b.set(0);
            boolean isEmpty = TextUtils.isEmpty(aVar.f187736a);
            boolean a = C13603b.m24435a((Collection) aVar.f187737b);
            if ((!isEmpty || !a) && (aiVar = this.f187814c) != null) {
                aiVar.mo137258m();
                aiVar.mo137242h(z);
                this.f187817f = SystemClock.elapsedRealtime();
                C84145d.f187790j.f187795d = this.f187817f;
                HashMap<String, String> hashMap = aVar.f187740e;
                if (hashMap != null) {
                    for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                        aiVar.mo137183a(entry.getKey(), entry.getValue());
                    }
                }
                if (!isEmpty) {
                    aiVar.mo137231f(aVar.f187736a);
                } else if (!a) {
                    String str = aVar.f187741f;
                    if (str == null || str.length() == 0) {
                        C51423a.m95784a(3, "TTMusicPlayer", "music id is null");
                    }
                    C60768e.m110301a(aVar.f187741f, aVar.f187737b.toString(), "play");
                    C87385v a2 = C87385v.m151666a();
                    String str2 = aVar.f187741f;
                    List<String> list = aVar.f187737b;
                    C89219l.m154716b(list, "");
                    Object[] array = list.toArray(new String[0]);
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        aiVar.mo137241h(a2.mo141432a(str2, true, (String[]) Arrays.copyOf(strArr, strArr.length)));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                this.f187818g = aVar;
                C84145d.f187790j.f187799h = this.f187815d;
                C84145d.f187790j.f187798g = this.f187816e;
                C84145d.f187790j.f187797f = this.f187813a;
                C84145d.f187790j.f187794c = this.f187818g;
                C84145d.f187790j.f187796e = this.f187820i;
                aiVar.mo137251k();
            }
        } catch (Exception e) {
            m144715a(e);
        }
    }
}
