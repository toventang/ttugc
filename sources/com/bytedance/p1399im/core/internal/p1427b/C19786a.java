package com.bytedance.p1399im.core.internal.p1427b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19835al;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19906p;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.proto.MessageBody;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.im.core.internal.b.a */
public final class C19786a {

    /* renamed from: a */
    public static final Set<Integer> f46965a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public static final Set<String> f46966b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public static final Set<Integer> f46967c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public static final Set<Integer> f46968d = new CopyOnWriteArraySet();

    /* renamed from: e */
    public static final Set<Integer> f46969e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public static final Set<Integer> f46970f = new CopyOnWriteArraySet();

    /* renamed from: g */
    public static final Set<String> f46971g = new CopyOnWriteArraySet();

    /* renamed from: h */
    public static final Map<Integer, Map<String, MessageBody>> f46972h = new ConcurrentHashMap();

    /* renamed from: i */
    public static final Set<String> f46973i = new CopyOnWriteArraySet();

    /* renamed from: j */
    public static final Map<Integer, List<String>> f46974j = new ConcurrentHashMap();

    /* renamed from: k */
    public static final Set<Integer> f46975k = new CopyOnWriteArraySet();

    /* renamed from: l */
    public static final Set<Integer> f46976l = new CopyOnWriteArraySet();

    /* renamed from: m */
    public static final Map<String, WeakReference<C19835al>> f46977m = new ConcurrentHashMap();

    /* renamed from: n */
    public static final Set<String> f46978n = new CopyOnWriteArraySet();

    /* renamed from: a */
    public static void m37228a() {
        m37234a(false);
    }

    static {
        Covode.recordClassIndex(22630);
    }

    /* renamed from: b */
    public static boolean m37239b(String str) {
        return f46971g.contains(str);
    }

    /* renamed from: c */
    public static void m37241c(String str) {
        f46971g.add(str);
    }

    /* renamed from: a */
    public static boolean m37236a(String str) {
        return f46966b.contains(str);
    }

    /* renamed from: b */
    public static boolean m37238b(int i) {
        return f46967c.contains(Integer.valueOf(i));
    }

    /* renamed from: c */
    public static void m37240c(int i) {
        f46967c.add(Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m37242d(int i) {
        f46967c.remove(Integer.valueOf(i));
    }

    /* renamed from: e */
    public static void m37244e(int i) {
        f46968d.add(Integer.valueOf(i));
    }

    /* renamed from: f */
    public static void m37246f(int i) {
        f46968d.remove(Integer.valueOf(i));
    }

    /* renamed from: g */
    public static void m37247g(int i) {
        f46969e.add(Integer.valueOf(i));
    }

    /* renamed from: h */
    public static void m37248h(int i) {
        f46969e.remove(Integer.valueOf(i));
    }

    /* renamed from: i */
    public static boolean m37249i(int i) {
        return f46970f.contains(Integer.valueOf(i));
    }

    /* renamed from: j */
    public static void m37250j(int i) {
        f46970f.remove(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m37229a(int i) {
        Set<Integer> set = f46965a;
        if (set.contains(Integer.valueOf(i))) {
            set.remove(Integer.valueOf(i));
            C19483d.m36365a();
        }
    }

    /* renamed from: d */
    public static void m37243d(String str) {
        if (!TextUtils.isEmpty(str)) {
            f46977m.remove(str);
        }
    }

    /* renamed from: e */
    public static boolean m37245e(String str) {
        if (TextUtils.isEmpty(str) || !f46978n.remove(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m37251k(int i) {
        List<String> list = f46974j.get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m37234a(boolean z) {
        Map<Integer, Map<String, MessageBody>> map = f46972h;
        if (!map.isEmpty()) {
            for (Integer num : map.keySet()) {
                C19930x.m37536a();
                int intValue = num.intValue();
                Map<Integer, Map<String, MessageBody>> map2 = f46972h;
                C19906p.m37472a(intValue, map2.get(num), z);
                map2.put(num, new ConcurrentHashMap());
            }
        }
        Set<String> set = f46973i;
        if (!set.isEmpty()) {
            for (String str : set) {
                C19930x.m37536a();
                C19930x.m37544b(str);
            }
            f46973i.clear();
        }
    }

    /* renamed from: b */
    public static void m37237b(int i, String str) {
        Map<Integer, Map<String, MessageBody>> map = f46972h;
        if (map.containsKey(Integer.valueOf(i))) {
            map.get(Integer.valueOf(i)).remove(str);
        }
    }

    /* renamed from: a */
    public static void m37230a(int i, C19538ai aiVar) {
        if (aiVar != null) {
            m37231a(i, new MessageBody.Builder().conversation_id(aiVar.getConversationId()).conversation_short_id(Long.valueOf(aiVar.getConversationShortId())).conversation_type(Integer.valueOf(aiVar.getConversationType())).create_time(Long.valueOf(aiVar.getCreatedAt())).build());
        }
    }

    /* renamed from: a */
    public static void m37231a(int i, MessageBody messageBody) {
        if (messageBody.conversation_id != null && messageBody.conversation_short_id != null && messageBody.conversation_type != null) {
            Map<Integer, Map<String, MessageBody>> map = f46972h;
            if (map.get(Integer.valueOf(i)) == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                concurrentHashMap.put(messageBody.conversation_id, messageBody);
                map.put(Integer.valueOf(i), concurrentHashMap);
                return;
            }
            map.get(Integer.valueOf(i)).put(messageBody.conversation_id, messageBody);
        }
    }

    /* renamed from: a */
    public static void m37233a(int i, Collection<String> collection) {
        List<String> list;
        if (collection != null && !collection.isEmpty() && (list = f46974j.get(Integer.valueOf(i))) != null) {
            list.removeAll(collection);
            if (list.isEmpty() && f46975k.contains(Integer.valueOf(i))) {
                C20014q.m37816a().mo31904b(i);
            }
        }
    }

    /* renamed from: a */
    public static boolean m37235a(int i, String str) {
        Map<Integer, Map<String, MessageBody>> map = f46972h;
        if (!map.containsKey(Integer.valueOf(i)) || map.get(Integer.valueOf(i)) == null || !map.get(Integer.valueOf(i)).containsKey(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m37232a(int i, String str, long j, int i2, long j2) {
        m37231a(i, new MessageBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).create_time(Long.valueOf(j2)).build());
    }
}
