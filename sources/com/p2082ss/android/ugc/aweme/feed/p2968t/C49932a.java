package com.p2082ss.android.ugc.aweme.feed.p2968t;

import android.content.Context;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.experiment.AbstractC49519k;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2397bm.C34888b;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedPreloadService;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.aweme.video.C80750l;
import com.p2082ss.android.ugc.aweme.video.preload.C80860b;
import com.p2082ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.p2082ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p2082ss.android.ugc.aweme.video.preload.p4213a.AbstractC80807a;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.p4314h.C84119i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.feed.t.a */
public final class C49932a {

    /* renamed from: a */
    public PreloadStrategyConfig f115094a;

    /* renamed from: b */
    protected C49445o f115095b;

    /* renamed from: c */
    private boolean f115096c;

    /* renamed from: d */
    private String f115097d;

    /* renamed from: e */
    private boolean f115098e;

    /* renamed from: f */
    private boolean f115099f;

    /* renamed from: g */
    private PreloadStrategyConfig f115100g;

    static {
        Covode.recordClassIndex(59043);
    }

    /* renamed from: a */
    private static List<PreloadStrategyConfig> m93758a() {
        return SmartFeedPreloadService.instance().getSmartPreloadStrategyExperimentValue();
    }

    public C49932a(PreloadStrategyConfig preloadStrategyConfig) {
        this(null, preloadStrategyConfig);
    }

    /* renamed from: a */
    private static String m93757a(Context context) {
        if (!TextUtils.isEmpty(C58029j.f132254f) && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132254f;
        }
        String networkAccessType = NetworkUtils.getNetworkAccessType(context);
        C58029j.f132254f = networkAccessType;
        return networkAccessType;
    }

    /* renamed from: a */
    private static void m93759a(String str) {
        if (AbstractC49519k.f113895a == 1) {
            int f = C84116g.m144637f();
            String a = m93757a(C17867d.m33078a());
            int b = C80750l.m140052a(C17867d.m33078a()).mo123955b(C17867d.m33078a());
            C84119i[] b2 = C84116g.m144636e().mo124228b();
            if (b2 != null) {
                C1731i.m5640b(new CallableC49933b(b2, str, f, a, b), C39162r.m79452a());
            }
        }
    }

    public C49932a(C49445o oVar, PreloadStrategyConfig preloadStrategyConfig) {
        this.f115095b = oVar;
        this.f115100g = preloadStrategyConfig;
    }

    /* renamed from: a */
    private void m93760a(boolean z, String str) {
        C49445o oVar = this.f115095b;
        if (oVar != null) {
            oVar.mo81198a(z, str);
        }
    }

    /* renamed from: a */
    private static int m93755a(List<Aweme> list, int i) {
        int i2 = i + 1;
        if (i2 < list.size() && list.get(i2) != null && C80860b.m140277b(C80860b.m140276a(list.get(i2).getAid()))) {
            return 1;
        }
        if (i >= list.size() || list.get(i) == null || !C80860b.m140277b(C80860b.m140276a(list.get(i).getAid()))) {
            return -1;
        }
        return 0;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m93756a(C84119i[] iVarArr, String str, int i, String str2, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int length = iVarArr.length - 1; length >= 0; length--) {
                C84119i iVar = iVarArr[length];
                if (iVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("file_size", iVar.f187722c);
                    jSONObject2.put("cost_time", iVar.f187723d);
                    if (length > 0) {
                        int i3 = length - 1;
                        if (iVarArr[i3] != null) {
                            jSONObject2.put("interval_time", iVar.f187724e - iVarArr[i3].f187724e);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject2.put("interval_time", 0);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("group_id", str);
            jSONObject.put("speed_record", jSONArray);
            jSONObject.put("internet_speed", i);
            jSONObject.put("strategy", 0);
            jSONObject.put("access", str2);
            jSONObject.put("signal", i2);
            jSONObject.put("qsize", C84116g.f187707a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C39162r.m79463b("video_speed_monitor", jSONObject);
        C34888b.m71266b("video_speed_monitor", jSONObject);
        return null;
    }

    /* renamed from: a */
    public final void mo84979a(boolean z, String str, long j, long j2, AbstractC48191b bVar, int i, boolean z2) {
        Video video;
        VideoUrlModel properPlayAddr;
        String sourceId;
        int a;
        C1764a.m5928a("onDownloadProgressChange with %s, %d, %d", new Object[]{str, Long.valueOf(j), Long.valueOf(j2)});
        if (j == j2) {
            m93760a(z, str);
        }
        Aweme c = bVar.mo80287c(i);
        if (!(c == null || c.getVideo() == null || (video = c.getVideo()) == null)) {
            if (AbstractC80807a.f180735a) {
                properPlayAddr = C80662ac.m139881a(video);
            } else {
                properPlayAddr = video.getProperPlayAddr();
            }
            if (!(properPlayAddr == null || TextUtils.isEmpty(str))) {
                if (!z) {
                    sourceId = properPlayAddr.getBitRatedRatioUri();
                } else {
                    sourceId = properPlayAddr.getSourceId();
                }
                if (TextUtils.equals(str, sourceId)) {
                    if (!TextUtils.equals(sourceId, this.f115097d)) {
                        this.f115099f = false;
                        this.f115098e = true;
                        this.f115097d = sourceId;
                        this.f115096c = false;
                        PreloadStrategyConfig preloadStrategyConfig = this.f115094a;
                        if (preloadStrategyConfig != null) {
                            preloadStrategyConfig.clearFlag();
                        }
                    } else {
                        this.f115098e = false;
                    }
                    if (j2 == j && !this.f115099f) {
                        this.f115099f = true;
                        m93759a(properPlayAddr.getSourceId());
                    }
                    if (this.f115098e) {
                        List<PreloadStrategyConfig> a2 = m93758a();
                        if (a2 != null && a2.size() > 0) {
                            long min = Math.min(Math.max(Math.max(a2.get(0).getNetworkLower(), 0L), (long) C84116g.m144637f()), Math.min(a2.get(a2.size() - 1).getNetworkUpper(), 25000L));
                            Iterator<PreloadStrategyConfig> it = a2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                PreloadStrategyConfig next = it.next();
                                if (next != null && min >= next.getNetworkLower() && min <= next.getNetworkUpper()) {
                                    this.f115094a = next;
                                    break;
                                }
                            }
                        } else {
                            this.f115094a = SmartFeedPreloadService.instance().getCurrentSmartPreloadStrategyConfig();
                        }
                    }
                    if (this.f115094a == null) {
                        this.f115094a = this.f115100g;
                    }
                    List<PreloadTask> emptyList = Collections.emptyList();
                    for (PreloadTask preloadTask : this.f115094a.getTasks()) {
                        if (!preloadTask.alreadyPreload && 100 * j2 >= ((long) preloadTask.progress) * j) {
                            if (emptyList.isEmpty()) {
                                emptyList = new ArrayList();
                            }
                            emptyList.add(preloadTask);
                            preloadTask.alreadyPreload = true;
                        }
                    }
                    if (!emptyList.isEmpty()) {
                        if (z2 && (a = m93755a(bVar.mo80288e(), i)) != -1) {
                            for (PreloadTask preloadTask2 : emptyList) {
                                preloadTask2.offset = a;
                            }
                        }
                        C80662ac.m139886a(z2, i, bVar.mo80288e(), emptyList);
                    }
                }
            }
        }
    }
}
