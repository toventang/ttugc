package com.p2082ss.android.ugc.aweme.app;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.newmedia.C30121a;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.CommandDispatcher */
public final class CommandDispatcher implements NetworkUtils.AbstractC29831d {

    /* renamed from: a */
    public static final String f79685a = C30121a.m59911a("/command/feedback/");

    /* renamed from: b */
    public static AtomicBoolean f79686b = new AtomicBoolean(false);

    /* renamed from: c */
    public LinkedHashSet<Long> f79687c;

    /* renamed from: d */
    volatile List<Object> f79688d;

    /* renamed from: e */
    private ArrayList<Object> f79689e;

    /* renamed from: f */
    private HandlerThread f79690f;

    /* renamed from: g */
    private Handler f79691g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.app.CommandDispatcher$CommandDispatcherApi */
    public interface CommandDispatcherApi {
        static {
            Covode.recordClassIndex(40429);
        }

        @AbstractC22012t
        @AbstractC21999g
        AbstractFutureC27655q<String> doPost(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map);
    }

    @Override // com.p2082ss.android.common.util.NetworkUtils.AbstractC29831d
    /* renamed from: a */
    public final String mo52118a() {
        return "X-SS-Command";
    }

    /* renamed from: com.ss.android.ugc.aweme.app.CommandDispatcher$a */
    public static class C33550a {

        /* renamed from: a */
        public static final CommandDispatcher f79692a = new CommandDispatcher((byte) 0);

        static {
            Covode.recordClassIndex(40430);
        }
    }

    static {
        Covode.recordClassIndex(40428);
    }

    private CommandDispatcher() {
        this.f79687c = new LinkedHashSet<>();
        this.f79689e = new ArrayList<>();
    }

    /* renamed from: com.ss.android.ugc.aweme.app.CommandDispatcher$b */
    public class C33551b extends Thread {
        static {
            Covode.recordClassIndex(40431);
        }

        public final void run() {
            MethodCollector.m26663i(4657);
            long lastActiveTime = AppLog.getLastActiveTime();
            while (System.currentTimeMillis() - lastActiveTime < 60000 && m68739a()) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            CommandDispatcher.f79686b.set(false);
            MethodCollector.m26664o(4657);
        }

        /* renamed from: a */
        private boolean m68739a() {
            MethodCollector.m26663i(4665);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (CommandDispatcher.this.f79687c) {
                try {
                    linkedHashSet.addAll(CommandDispatcher.this.f79687c);
                } finally {
                    MethodCollector.m26664o(4665);
                }
            }
            if (linkedHashSet.isEmpty()) {
                MethodCollector.m26664o(4665);
                return false;
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                if (longValue > 0) {
                    sb.append(longValue).append(",");
                }
            }
            if (sb.length() == 0) {
                MethodCollector.m26664o(4665);
                return false;
            }
            try {
                if (!m68738a(sb.substring(0, sb.length() - 1)).booleanValue()) {
                    return false;
                }
                synchronized (CommandDispatcher.this.f79687c) {
                    try {
                        CommandDispatcher.this.f79687c.removeAll(linkedHashSet);
                    } finally {
                        MethodCollector.m26664o(4665);
                    }
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public C33551b() {
        }

        /* renamed from: a */
        private static Boolean m68738a(String str) {
            if (C13627m.m24498a(str)) {
                return false;
            }
            CommandDispatcherApi commandDispatcherApi = (CommandDispatcherApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(CommandDispatcherApi.class);
            HashMap hashMap = new HashMap();
            hashMap.put("command_ids", str);
            try {
                String str2 = commandDispatcherApi.doPost(CommandDispatcher.f79685a, hashMap).get();
                if (str2 == null || str2.length() == 0) {
                    return false;
                }
                return Boolean.valueOf("success".equals(new JSONObject(str2).getString("message")));
            } catch (ExecutionException e) {
                throw e.getCause();
            }
        }
    }

    /* renamed from: b */
    private synchronized Handler m68735b() {
        Handler handler;
        MethodCollector.m26663i(4739);
        if (this.f79690f == null) {
            HandlerThread handlerThread = new HandlerThread("AppData-AsyncOp");
            this.f79690f = handlerThread;
            handlerThread.start();
            this.f79691g = new WeakHandler(this.f79690f.getLooper(), new C33839q(this));
            C51423a.m95783a();
        }
        handler = this.f79691g;
        MethodCollector.m26664o(4739);
        return handler;
    }

    /* synthetic */ CommandDispatcher(byte b) {
        this();
    }

    /* renamed from: a */
    private void m68734a(LinkedHashSet<Long> linkedHashSet) {
        MethodCollector.m26663i(4753);
        if (linkedHashSet.isEmpty()) {
            MethodCollector.m26664o(4753);
            return;
        }
        synchronized (this.f79687c) {
            try {
                linkedHashSet.addAll(this.f79687c);
            } finally {
                MethodCollector.m26664o(4753);
            }
        }
        int i = 0;
        int size = linkedHashSet.size() - 100;
        Iterator<Long> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            if (i > size) {
                break;
            }
            linkedHashSet.remove(next);
            i++;
        }
        synchronized (this.f79687c) {
            try {
                this.f79687c.addAll(linkedHashSet);
            } finally {
                MethodCollector.m26664o(4753);
            }
        }
    }

    @Override // com.p2082ss.android.common.util.NetworkUtils.AbstractC29831d
    /* renamed from: a */
    public final void mo52119a(List<String> list) {
        for (String str : list) {
            if (str != null && !C13627m.m24498a(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    LinkedHashSet<Long> linkedHashSet = new LinkedHashSet<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        long optLong = jSONObject.optLong("i");
                        if (optLong > 0) {
                            linkedHashSet.add(Long.valueOf(optLong));
                            m68735b().sendMessage(m68735b().obtainMessage(104, jSONObject));
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        m68734a(linkedHashSet);
                        if (f79686b.compareAndSet(false, true)) {
                            new C33551b().start();
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
