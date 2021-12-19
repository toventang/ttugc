package com.bytedance.apm.p779k;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.services.slardar.config.AbstractC22715a;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.e */
public final class C12535e implements AbstractC22715a {

    /* renamed from: a */
    public final Map<String, Boolean> f30443a;

    /* renamed from: b */
    public final Map<String, Boolean> f30444b;

    /* renamed from: c */
    public volatile JSONObject f30445c;

    /* renamed from: d */
    private List<String> f30446d;

    /* renamed from: e */
    private List<String> f30447e;

    /* renamed from: f */
    private List<String> f30448f;

    /* renamed from: g */
    private Map<String, String> f30449g;

    static {
        Covode.recordClassIndex(14351);
    }

    @Override // com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: d */
    public final void mo20038d() {
    }

    /* renamed from: com.bytedance.apm.k.e$a */
    public static class C12536a {

        /* renamed from: a */
        public static final C12535e f30450a = new C12535e((byte) 0);

        static {
            Covode.recordClassIndex(14352);
        }
    }

    private C12535e() {
        this.f30443a = new ConcurrentHashMap();
        this.f30444b = new ConcurrentHashMap();
        this.f30449g = new HashMap();
        LinkedList linkedList = new LinkedList();
        this.f30446d = linkedList;
        linkedList.addAll(Arrays.asList("battery", "smooth", "cpu", "disk", "memory", "thread", "fd", "page_load", "page_load_trace", "start", "start_trace", "traffic", "ui"));
        ArrayList arrayList = new ArrayList();
        this.f30447e = arrayList;
        arrayList.add("enable_upload");
        this.f30447e.add("drop_enable_upload");
        this.f30447e.add("serious_block_enable_upload");
        this.f30447e.add("block_enable_upload");
        this.f30447e.add("slow_method_enable_upload");
        LinkedList linkedList2 = new LinkedList();
        this.f30448f = linkedList2;
        linkedList2.add("enable_perf_data_collect");
        this.f30449g.put("enable_upload", "fps");
        this.f30449g.put("drop_enable_upload", "fps_drop");
        this.f30449g.put("block_enable_upload", "block_monitor");
        this.f30449g.put("slow_method_enable_upload", "drop_frame_stack");
        this.f30449g.put("serious_block_enable_upload", "serious_block_monitor");
        ((IConfigManager) C21520c.m40424a(IConfigManager.class)).registerConfigListener(this);
    }

    /* synthetic */ C12535e(byte b) {
        this();
    }

    /* renamed from: a */
    public final boolean mo20360a(String str) {
        Boolean bool = this.f30444b.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0106, code lost:
        if (r8 != null) goto L_0x0108;
     */
    @Override // com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20180a(org.json.JSONObject r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p779k.C12535e.mo20180a(org.json.JSONObject, boolean):void");
    }
}
