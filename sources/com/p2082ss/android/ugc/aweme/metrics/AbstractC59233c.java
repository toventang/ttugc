package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.profile.model.HotListStruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.metrics.c */
public abstract class AbstractC59233c<E extends AbstractC59233c> {

    /* renamed from: a */
    private final Map<String, Object> f135164a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f135165b = new HashMap();

    /* renamed from: c */
    private Map<String, Set<Object>> f135166c = new HashMap();

    /* renamed from: f */
    protected final String f135167f;

    /* renamed from: g */
    public final Map<String, String> f135168g = new HashMap();

    /* renamed from: h */
    protected String f135169h;

    /* renamed from: i */
    protected String f135170i;

    /* renamed from: j */
    protected boolean f135171j;

    /* renamed from: k */
    public boolean f135172k = false;

    /* renamed from: l */
    protected String f135173l;

    /* renamed from: m */
    protected String f135174m;

    /* renamed from: n */
    protected String f135175n;

    /* renamed from: o */
    public Map<String, Object> f135176o = new HashMap();

    static {
        Covode.recordClassIndex(69596);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo69786a();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo96745d() {
    }

    /* renamed from: e */
    public void mo96791e() {
        mo96745d();
        mo69786a();
        this.f135168g.putAll(this.f135165b);
    }

    /* renamed from: f */
    public final void mo96792f() {
        mo96791e();
        C29339a.m58752a(new RunnableC59238d(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.metrics.c$a */
    public interface AbstractC59234a {

        /* renamed from: a */
        public static final AbstractC59234a f135177a = new AbstractC59234a() {
            /* class com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c.AbstractC59234a.C592351 */

            static {
                Covode.recordClassIndex(69598);
            }

            @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c.AbstractC59234a
            /* renamed from: a */
            public final String mo96795a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final AbstractC59234a f135178b = new AbstractC59234a() {
            /* class com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c.AbstractC59234a.C592362 */

            static {
                Covode.recordClassIndex(69599);
            }

            @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c.AbstractC59234a
            /* renamed from: a */
            public final String mo96795a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo96795a(String str);

        static {
            Covode.recordClassIndex(69597);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo96793g() {
        try {
            if (this.f135172k) {
                JSONObject a = C59208ac.m108761a(this.f135168g);
                if (this.f135176o.size() > 0) {
                    this.f135164a.putAll(this.f135168g);
                    this.f135164a.putAll(this.f135176o);
                    a = C59208ac.m108765b(this.f135164a);
                }
                C29819a.m60077a(this.f135167f, a);
                return;
            }
            C39161q.m79451a(this.f135167f, this.f135168g);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo96794h(String str) {
        mo96790a("log_pb", C48027ac.C48028a.f111257a.mo80055a(str), AbstractC59234a.f135177a);
    }

    /* renamed from: c */
    public static String m108854c(Aweme aweme) {
        if (aweme.getAuthor() != null) {
            return aweme.getAuthor().getUid();
        }
        return "";
    }

    /* renamed from: d */
    public static String m108855d(Aweme aweme) {
        int awemeType = aweme.getAwemeType();
        if (awemeType == 2) {
            return UGCMonitor.TYPE_PHOTO;
        }
        if (awemeType != 101) {
            return "video";
        }
        return "live";
    }

    /* renamed from: e */
    public static Long m108856e(Aweme aweme) {
        long id;
        if (aweme.getMusic() == null) {
            id = 0;
        } else {
            id = aweme.getMusic().getId();
        }
        return Long.valueOf(id);
    }

    public AbstractC59233c(String str) {
        this.f135167f = str;
    }

    /* renamed from: a */
    public final E mo96788a(Map<String, String> map) {
        this.f135165b.putAll(map);
        return this;
    }

    /* renamed from: b */
    public void mo96767b(Aweme aweme) {
        if (aweme != null) {
            aweme.getAid();
            aweme.getRank();
            if (aweme.getRank() != -1) {
                this.f135175n = String.valueOf(aweme.getRank());
            } else {
                this.f135175n = m108853b(aweme, 9);
            }
            if (!(aweme.getVideo() == null || aweme.getVideo().getVideoTag() == null)) {
                this.f135174m = aweme.getVideo().getVideoTag().getTitle();
            }
            if (TextUtils.isEmpty(this.f135174m) && aweme.getNewLabel() == 1) {
                this.f135174m = "New";
            }
        }
    }

    /* renamed from: a */
    public final void mo96789a(Aweme aweme) {
        if (aweme != null) {
            HotSearchInfo hotSearchInfo = aweme.getHotSearchInfo();
            if (hotSearchInfo == null || hotSearchInfo.getSentence() == null) {
                this.f135170i = aweme.getHotSpot();
            } else {
                this.f135170i = hotSearchInfo.getSentence();
            }
            HotListStruct hotListStruct = aweme.getHotListStruct();
            if (hotListStruct != null) {
                if (hotListStruct.getType() == 9) {
                    this.f135171j = true;
                }
                if (hotListStruct.getType() == 9 && TextUtils.isEmpty(this.f135170i)) {
                    this.f135170i = hotListStruct.getTitile();
                }
            }
        }
    }

    /* renamed from: a */
    public final AbstractC59233c mo96786a(String str, String str2) {
        mo96790a(str, str2, AbstractC59234a.f135177a);
        return this;
    }

    /* renamed from: a */
    public static String m108852a(Aweme aweme, int i) {
        return RequestIdService.m70076a().mo60695b(aweme, i).optString("request_id");
    }

    /* renamed from: b */
    static String m108853b(Aweme aweme, int i) {
        return RequestIdService.m70076a().mo60695b(aweme, i).optString("order");
    }

    /* renamed from: a */
    public final AbstractC59233c mo96785a(String str, int i) {
        mo96790a(str, String.valueOf(i), AbstractC59234a.f135177a);
        return this;
    }

    /* renamed from: a */
    public final AbstractC59233c mo96787a(String str, boolean z) {
        mo96790a(str, String.valueOf(z), AbstractC59234a.f135177a);
        return this;
    }

    /* renamed from: a */
    public final void mo96790a(String str, String str2, AbstractC59234a aVar) {
        this.f135168g.put(str, aVar.mo96795a(str2));
    }
}
