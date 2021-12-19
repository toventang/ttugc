package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.AbstractC53631a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53700k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.KeepSurfaceTextureView;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56222f;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d */
public class C54542d extends AbstractC53631a {

    /* renamed from: e */
    private static volatile C54542d f125004e;

    /* renamed from: a */
    public Map<String, Object> f125005a = new ConcurrentHashMap();

    /* renamed from: b */
    Map<String, AbstractC56222f> f125006b = new ConcurrentHashMap();

    /* renamed from: c */
    public String f125007c = "";

    /* renamed from: d */
    public boolean f125008d;

    /* renamed from: f */
    private List<BaseContent> f125009f = new CopyOnWriteArrayList();

    /* renamed from: g */
    private Set<String> f125010g = new HashSet();

    /* renamed from: h */
    private Map<String, KeepSurfaceTextureView> f125011h = new ConcurrentHashMap();

    /* renamed from: i */
    private int f125012i = -1;

    /* renamed from: j */
    private volatile AbstractC88412b f125013j;

    static {
        Covode.recordClassIndex(64253);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.AbstractC53631a
    /* renamed from: a */
    public final void mo90192a() {
        super.mo90192a();
        this.f125006b.clear();
        this.f125011h.clear();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.AbstractC53631a
    /* renamed from: d */
    public final void mo90198d() {
        C53700k.m98970a(new RunnableC54544f(this), 200);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.AbstractC53631a
    /* renamed from: b */
    public final void mo90196b() {
        Map<String, Object> map = this.f125005a;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                entry.getValue();
            }
        }
    }

    /* renamed from: f */
    public static C54542d m100005f() {
        MethodCollector.m26663i(5626);
        if (f125004e == null) {
            synchronized (C54542d.class) {
                try {
                    if (f125004e == null) {
                        f125004e = new C54542d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5626);
                    throw th;
                }
            }
        }
        C54542d dVar = f125004e;
        MethodCollector.m26664o(5626);
        return dVar;
    }

    private C54542d() {
        Set<String> stringSet = C55219n.m100965a().f126297a.getStringSet("share_video_message_has_watched", null);
        if (!C13603b.m24435a((Collection) stringSet)) {
            this.f125010g.addAll(stringSet);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.AbstractC53631a
    /* renamed from: c */
    public final void mo90197c() {
        super.mo90197c();
        C55219n a = C55219n.m100965a();
        a.f126297a.edit().putStringSet("share_video_message_has_watched", this.f125010g).commit();
        if (this.f125005a.get(this.f125007c) != null) {
            this.f125005a.get(this.f125007c);
        }
        this.f125005a.clear();
        this.f125009f.clear();
        if (!this.f125006b.isEmpty()) {
            for (Map.Entry<String, AbstractC56222f> entry : this.f125006b.entrySet()) {
                entry.getValue().mo92003e();
            }
        }
        this.f125006b.clear();
        this.f125011h.clear();
        this.f125012i = -1;
        this.f125008d = false;
        if (this.f125013j != null) {
            this.f125013j.dispose();
            this.f125013j = null;
        }
    }

    /* renamed from: a */
    public final Runnable mo91631a(RecyclerView recyclerView) {
        return new RunnableC54543e(this, recyclerView);
    }

    /* renamed from: b */
    public final synchronized void mo91632b(String str) {
        MethodCollector.m26663i(5757);
        this.f125007c = str;
        MethodCollector.m26664o(5757);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.AbstractC53631a
    /* renamed from: a */
    public final AbstractC56222f mo90191a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AbstractC56222f fVar = this.f125006b.get(str);
        if (fVar == null && (fVar = C55076b.m100722a()) != null) {
            this.f125006b.put(str, fVar);
        }
        return fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.AbstractC53631a
    /* renamed from: a */
    public final void mo90193a(RecyclerView recyclerView, int i) {
        Map<String, Object> map;
        if (i == 0 && (ActivityStack.getTopActivity() instanceof ChatRoomActivity) && recyclerView != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            Runnable a = mo91631a(recyclerView);
            if (!this.f125008d || (map = this.f125005a) == null || map.size() <= 0) {
                a.run();
                return;
            }
            recyclerView.getAdapter().notifyDataSetChanged();
            C53700k.m98969a(a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.AbstractC53631a
    /* renamed from: a */
    public final void mo90194a(RecyclerView recyclerView, boolean z) {
        if (!z) {
            mo90193a(recyclerView, 0);
        } else if (this.f125005a.get(this.f125007c) != null) {
            this.f125005a.get(this.f125007c);
        }
    }
}
