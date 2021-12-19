package com.p2082ss.android.ugc.aweme.download.component_api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30379q;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30393y;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30426r;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30429u;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import com.p2082ss.android.ugc.aweme.download.component_api.p2809a.AbstractC43168a;
import com.p2082ss.android.ugc.aweme.download.component_api.p2809a.AbstractC43169b;
import com.p2082ss.android.ugc.aweme.download.component_api.p2810b.AbstractC43173a;
import com.p2082ss.android.ugc.aweme.download.component_api.p2810b.AbstractC43174b;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.a */
public abstract class AbstractC43167a {

    /* renamed from: A */
    protected AbstractC30429u f100598A;

    /* renamed from: B */
    protected AbstractC30393y f100599B;

    /* renamed from: C */
    public IDownloadListener f100600C;

    /* renamed from: D */
    public IDownloadListener f100601D;

    /* renamed from: E */
    public IDownloadListener f100602E;

    /* renamed from: F */
    protected IDownloadDepend f100603F;

    /* renamed from: G */
    protected boolean f100604G;

    /* renamed from: H */
    public EnumC43176c f100605H;

    /* renamed from: I */
    protected String f100606I;

    /* renamed from: J */
    protected String f100607J;

    /* renamed from: K */
    public Map<String, String> f100608K;

    /* renamed from: L */
    protected boolean f100609L;

    /* renamed from: M */
    protected String f100610M;

    /* renamed from: N */
    protected AbstractC43174b f100611N;

    /* renamed from: O */
    protected boolean f100612O;

    /* renamed from: P */
    protected String f100613P;

    /* renamed from: Q */
    public AbstractC43173a f100614Q;

    /* renamed from: R */
    protected boolean f100615R;

    /* renamed from: S */
    protected int f100616S;

    /* renamed from: T */
    public boolean f100617T;

    /* renamed from: U */
    public boolean f100618U;

    /* renamed from: V */
    public AbstractC43169b f100619V;

    /* renamed from: W */
    public AbstractC43168a f100620W;

    /* renamed from: X */
    protected boolean f100621X;

    /* renamed from: Y */
    protected boolean f100622Y;

    /* renamed from: Z */
    protected boolean f100623Z;

    /* renamed from: a */
    public Context f100624a;

    /* renamed from: b */
    public int f100625b;

    /* renamed from: c */
    public String f100626c;

    /* renamed from: d */
    public String f100627d;

    /* renamed from: e */
    public String f100628e;

    /* renamed from: f */
    public String f100629f;

    /* renamed from: g */
    protected boolean f100630g;

    /* renamed from: h */
    protected boolean f100631h;

    /* renamed from: i */
    protected String f100632i;

    /* renamed from: j */
    protected List<HttpHeader> f100633j;

    /* renamed from: k */
    protected int f100634k;

    /* renamed from: l */
    protected int f100635l;

    /* renamed from: m */
    protected int f100636m;

    /* renamed from: n */
    public List<String> f100637n;

    /* renamed from: o */
    protected boolean f100638o;

    /* renamed from: p */
    protected String f100639p;

    /* renamed from: q */
    protected boolean f100640q;

    /* renamed from: r */
    public String f100641r;

    /* renamed from: s */
    public String f100642s;

    /* renamed from: t */
    protected String f100643t;

    /* renamed from: u */
    protected boolean f100644u = true;

    /* renamed from: v */
    protected String f100645v;

    /* renamed from: w */
    protected long f100646w;

    /* renamed from: x */
    protected boolean f100647x;

    /* renamed from: y */
    protected boolean f100648y;

    /* renamed from: z */
    protected AbstractC30379q f100649z;

    static {
        Covode.recordClassIndex(51346);
    }

    /* renamed from: a */
    public abstract int mo73396a(AbstractC30426r rVar);

    /* renamed from: a */
    public abstract int mo73397a(EnumC43176c cVar);

    /* renamed from: a */
    public void mo73403a(int i, AbsDownloadListener absDownloadListener, EnumC30294h hVar) {
    }

    /* renamed from: b */
    public final AbstractC43167a mo73404b() {
        this.f100631h = true;
        return this;
    }

    /* renamed from: c */
    public final AbstractC43167a mo73406c() {
        this.f100616S = 3;
        return this;
    }

    /* renamed from: d */
    public final AbstractC43167a mo73407d() {
        this.f100621X = true;
        return this;
    }

    /* renamed from: e */
    public final AbstractC43167a mo73408e() {
        this.f100604G = true;
        return this;
    }

    /* renamed from: f */
    public abstract int mo73409f();

    /* renamed from: a */
    public final AbstractC43167a mo73398a() {
        this.f100622Y = true;
        return this;
    }

    /* renamed from: b */
    public final AbstractC43167a mo73405b(String str) {
        this.f100609L = true;
        this.f100610M = str;
        this.f100611N = null;
        return this;
    }

    /* renamed from: a */
    public final AbstractC43167a mo73399a(int i) {
        this.f100634k = i;
        return this;
    }

    /* renamed from: a */
    public final AbstractC43167a mo73400a(String str) {
        this.f100645v = str;
        return this;
    }

    /* renamed from: a */
    public final AbstractC43167a mo73401a(List<HttpHeader> list) {
        this.f100633j = list;
        return this;
    }

    /* renamed from: a */
    public final AbstractC43167a mo73402a(boolean z) {
        this.f100623Z = z;
        return this;
    }

    public AbstractC43167a(Context context, String str) {
        this.f100624a = context;
        this.f100628e = str;
    }
}
