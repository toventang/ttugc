package com.p2082ss.android.ugc.aweme.childhook;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.childhook.p2457a.p2460c.AbstractC35687c;
import com.p2082ss.android.ugc.aweme.childhook.p2457a.p2460c.C35685a;
import com.p2082ss.android.ugc.aweme.childhook.p2457a.p2460c.C35686b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.childhook.b */
public final class C35688b {

    /* renamed from: a */
    public static final C35688b f84180a = new C35688b();

    private C35688b() {
    }

    static {
        Covode.recordClassIndex(42918);
    }

    /* renamed from: b */
    public static Intent m72853b(Message message) {
        try {
            Field declaredField = message.obj.getClass().getDeclaredField("intent");
            C89219l.m154716b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(message.obj);
            if (obj != null) {
                return (Intent) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.Intent");
        } catch (Exception e) {
            e.printStackTrace();
            C13468b.m24211a(e, "ChildBroadcastReceiverHook.getIntent");
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.childhook.b$a */
    public static final class C35689a implements Handler.Callback {

        /* renamed from: a */
        final /* synthetic */ Handler.Callback f84181a;

        static {
            Covode.recordClassIndex(42919);
        }

        public C35689a(Handler.Callback callback) {
            this.f84181a = callback;
        }

        public final boolean handleMessage(Message message) {
            C89219l.m154721d(message, "");
            if (message.what == 113) {
                String a = C35688b.m72852a(message);
                C35688b.m72853b(message);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C35685a());
                arrayList.add(new C35686b());
                if (arrayList.size() <= 0) {
                    return true;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((AbstractC35687c) arrayList.get(i)).mo62729a(a)) {
                        if (!((AbstractC35687c) arrayList.get(i)).mo62730b(a)) {
                            return true;
                        } else {
                            Handler.Callback callback = this.f84181a;
                            if (callback != null) {
                                return callback.handleMessage(message);
                            }
                            return false;
                        }
                    }
                }
                return true;
            }
            Handler.Callback callback2 = this.f84181a;
            if (callback2 != null) {
                return callback2.handleMessage(message);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static String m72852a(Message message) {
        try {
            Field declaredField = message.obj.getClass().getDeclaredField("info");
            C89219l.m154716b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(message.obj);
            Field field = obj.getClass().getField(StringSet.name);
            C89219l.m154716b(field, "");
            field.setAccessible(true);
            Object obj2 = field.get(obj);
            if (obj2 != null) {
                return (String) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e) {
            e.printStackTrace();
            C13468b.m24211a(e, "ChildBroadcastReceiverHook.getClassName");
            return "";
        }
    }
}
