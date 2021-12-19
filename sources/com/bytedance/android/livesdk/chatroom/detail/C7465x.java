package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.p492g.C7572d;
import com.bytedance.android.livesdk.livesetting.pullstream.EnableEnterRoomOptReuseRoomPlayerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.view.AbstractC11876d;
import com.bytedance.android.p149d.AbstractC2717b;
import com.bytedance.android.p149d.AbstractC2719c;
import com.bytedance.android.p149d.AbstractC2722e;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.x */
public class C7465x implements AbstractC2722e {

    /* renamed from: a */
    public static final String f18559a = C7465x.class.getSimpleName();

    /* renamed from: d */
    private static volatile C7465x f18560d;

    /* renamed from: b */
    private final Map<String, AbstractC2719c> f18561b = new HashMap();

    /* renamed from: c */
    private final Queue<AbstractC2719c> f18562c = new LinkedList();

    static {
        Covode.recordClassIndex(8235);
    }

    /* renamed from: b */
    public static boolean m15383b() {
        Boolean valueOf = Boolean.valueOf(EnableEnterRoomOptReuseRoomPlayerSetting.INSTANCE.getValue());
        if (valueOf == null || valueOf.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C7465x m15380a() {
        MethodCollector.m26663i(12672);
        if (f18560d == null) {
            synchronized (C7465x.class) {
                try {
                    if (f18560d == null) {
                        f18560d = new C7465x();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12672);
                    throw th;
                }
            }
        }
        C7465x xVar = f18560d;
        MethodCollector.m26664o(12672);
        return xVar;
    }

    /* renamed from: a */
    private static Context m15379a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    @Override // com.bytedance.android.p149d.AbstractC2722e
    /* renamed from: b */
    public final AbstractC2719c mo7297b(String str) {
        if (this.f18561b.containsKey(str)) {
            return this.f18561b.get(str);
        }
        return null;
    }

    @Override // com.bytedance.android.p149d.AbstractC2722e
    /* renamed from: b */
    public final void mo7298b(AbstractC2719c cVar) {
        Iterator<Map.Entry<String, AbstractC2719c>> it = this.f18561b.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC2719c value = it.next().getValue();
            if (value == null || cVar == null || !TextUtils.equals(value.getPlayerTag(), cVar.getPlayerTag())) {
                value.stop(true);
                value.release();
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final AbstractC2719c mo13701a(String str) {
        return this.f18561b.get(str);
    }

    /* renamed from: a */
    public final void mo13702a(AbstractC2719c cVar) {
        String playerTag = cVar.getPlayerTag();
        if (playerTag != null) {
            cVar.release();
            this.f18561b.remove(playerTag);
            this.f18562c.offer(cVar);
        }
    }

    /* renamed from: a */
    private static boolean m15382a(Context context, String str, String str2) {
        if (context == null) {
            return false;
        }
        if (!C13627m.m24498a(str) || !C13627m.m24498a(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m15381a(AbstractC2719c cVar, Context context, AbstractC11876d dVar, AbstractC2717b.AbstractC2718a aVar) {
        if (cVar != null) {
            cVar.attach(context, dVar, aVar);
        }
    }

    /* renamed from: a */
    public final AbstractC2719c mo13699a(long j, Context context, String str, String str2, String str3, String str4, C11738s.C11739a aVar, EnumC11728i iVar) {
        AbstractC2719c poll;
        AbstractC2719c.C2720a a = AbstractC2719c.C2720a.m7858a(m15379a(context)).mo7294a(str3);
        a.f8123c = str4;
        AbstractC2719c.C2720a b = a.mo7295b(str);
        b.f8125e = str2;
        b.f8126f = iVar;
        b.f8127g = aVar;
        if (!this.f18562c.isEmpty() && (poll = this.f18562c.poll()) != null) {
            poll.initialize(j, b);
        } else {
            poll = new RoomPlayer2(j, b);
        }
        this.f18561b.put(poll.getPlayerTag(), poll);
        C7572d.m15561a(f18559a, "createRoomPlayer -> playerTag: " + poll.getPlayerTag());
        return poll;
    }

    /* renamed from: a */
    public final AbstractC2719c mo13700a(long j, Context context, String str, String str2, String str3, String str4, C11738s.C11739a aVar, EnumC11728i iVar, boolean z, String str5, String str6) {
        if (!m15382a(context, str, str3)) {
            return null;
        }
        AbstractC2719c a = mo13699a(j, context, str, str2, str3, str4, aVar, iVar);
        a.setReusePlayer(z, str5);
        a.setEnterRoomScene(str6);
        a.warmUp();
        return a;
    }
}
