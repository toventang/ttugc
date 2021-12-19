package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.a */
public abstract class AbstractC71289a<T> implements WeakHandler.IHandler {

    /* renamed from: g */
    public static final C71290a f159785g = new C71290a((byte) 0);

    /* renamed from: c */
    public WeakHandler f159786c = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: d */
    public boolean f159787d;

    /* renamed from: e */
    public T f159788e;

    /* renamed from: f */
    public List<AbstractC71293d> f159789f = new LinkedList();

    static {
        Covode.recordClassIndex(83808);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo112782a(Object... objArr);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.a$a */
    public static final class C71290a {
        static {
            Covode.recordClassIndex(83809);
        }

        private C71290a() {
        }

        public /* synthetic */ C71290a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112781a(T t) {
        this.f159788e = t;
    }

    /* renamed from: b */
    public boolean mo112783b(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (!mo112782a(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        this.f159787d = true;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.a<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        C89219l.m154721d(message, "");
        this.f159787d = false;
        if (message.obj instanceof Exception) {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            Exception exc = (Exception) obj;
            exc.printStackTrace();
            List<AbstractC71293d> list = this.f159789f;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo112785a(exc);
                }
                return;
            }
            return;
        }
        mo112781a(message.obj);
        List<AbstractC71293d> list2 = this.f159789f;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().mo112787b();
            }
        }
    }
}
