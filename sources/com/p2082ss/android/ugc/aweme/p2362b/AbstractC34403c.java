package com.p2082ss.android.ugc.aweme.p2362b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.api.model.AnchorCell;
import com.p2082ss.android.ugc.aweme.api.model.C33542a;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3632b.C65741a;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3632b.C65744b;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3632b.C65746c;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3632b.C65749d;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3632b.C65753e;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89398e;
import p4628j.p4629a.p4630a.C89399f;
import p4628j.p4629a.p4630a.C89401h;

/* renamed from: com.ss.android.ugc.aweme.b.c */
public abstract class AbstractC34403c {

    /* renamed from: b */
    public static final C34404a f81320b = new C34404a((byte) 0);

    /* renamed from: a */
    public final AbstractC34884bl f81321a;

    static {
        Covode.recordClassIndex(41347);
    }

    /* renamed from: a */
    public abstract void mo60824a(C89399f fVar, AbstractC34884bl blVar, String str);

    /* renamed from: com.ss.android.ugc.aweme.b.c$a */
    public static final class C34404a {
        static {
            Covode.recordClassIndex(41348);
        }

        private C34404a() {
        }

        public /* synthetic */ C34404a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final C89399f mo60825a() {
        C89399f fVar = new C89399f();
        C89219l.m154721d(fVar, "");
        fVar.mo143770a(C33542a.class);
        new C89401h(fVar, C33542a.class).mo143777a(new C65744b(this.f81321a), new C65746c(this.f81321a), new C65753e(this.f81321a), new C65749d(this.f81321a), new C65741a(this.f81321a)).mo143778a(C34405b.f81322a);
        mo60824a(fVar, this.f81321a, "enter_page");
        return fVar;
    }

    public AbstractC34403c(AbstractC34884bl blVar) {
        this.f81321a = blVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.b.c$b */
    static final class C34405b<T> implements AbstractC89398e {

        /* renamed from: a */
        public static final C34405b f81322a = new C34405b();

        static {
            Covode.recordClassIndex(41349);
        }

        C34405b() {
        }

        @Override // p4628j.p4629a.p4630a.AbstractC89398e
        /* renamed from: a */
        public final /* synthetic */ int mo60826a(Object obj) {
            ArrayList<AnchorCell> arrayList;
            ArrayList<AnchorCell> arrayList2;
            C33542a aVar = (C33542a) obj;
            C89219l.m154721d(aVar, "");
            Integer num = aVar.f79665a;
            if (num != null && num.intValue() == 1) {
                ArrayList<AnchorCell> arrayList3 = aVar.f79669e;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    return 1;
                }
                return 2;
            }
            Integer num2 = aVar.f79665a;
            if (num2 != null && num2.intValue() == 2 && (arrayList = aVar.f79669e) != null && !arrayList.isEmpty()) {
                return 3;
            }
            Integer num3 = aVar.f79665a;
            if (num3 != null && num3.intValue() == 3 && (arrayList2 = aVar.f79669e) != null && !arrayList2.isEmpty()) {
                return 4;
            }
            return 0;
        }
    }
}
