package com.p2082ss.android.ugc.aweme.ecommerce.sku.view.skuwidget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.p2862a.C45430a;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.p2861c.C45419a;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.C45495c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.d */
public final class C45502d extends LinearLayoutCompat {

    /* renamed from: e */
    public static final C45504b f105994e = new C45504b((byte) 0);

    /* renamed from: a */
    final int f105995a;

    /* renamed from: b */
    final int f105996b;

    /* renamed from: c */
    public final ArrayList<C45495c> f105997c = new ArrayList<>();

    /* renamed from: d */
    public AbstractC45503a f105998d;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.d$a */
    public interface AbstractC45503a {
        static {
            Covode.recordClassIndex(53991);
        }

        /* renamed from: a */
        void mo76686a(String[] strArr);
    }

    static {
        Covode.recordClassIndex(53990);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.d$b */
    public static final class C45504b {
        static {
            Covode.recordClassIndex(53992);
        }

        private C45504b() {
        }

        public /* synthetic */ C45504b(byte b) {
            this();
        }
    }

    public final void setCheckedChangeListener(AbstractC45503a aVar) {
        C89219l.m154721d(aVar, "");
        this.f105998d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45502d(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        setOrientation(1);
        this.f105995a = (int) C13628n.m24520b(context, 20.0f);
        this.f105996b = (int) C13628n.m24520b(context, 8.0f);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.d$c */
    public static final class C45505c implements C45495c.AbstractC45497b {

        /* renamed from: a */
        final /* synthetic */ C45502d f105999a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f106000b;

        /* renamed from: c */
        final /* synthetic */ List f106001c;

        static {
            Covode.recordClassIndex(53993);
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.C45495c.AbstractC45497b
        /* renamed from: a */
        public final void mo76693a(int i, C45430a aVar) {
            String str;
            boolean z;
            String[] strArr = (String[]) this.f106000b.element;
            if (aVar == null || (str = aVar.f105840b) == null) {
                str = "";
            }
            strArr[i] = str;
            int i2 = 0;
            for (T t : this.f105999a.f105997c) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                if (i2 != i) {
                    List list = this.f106001c;
                    C89219l.m154721d(strArr, "");
                    C89219l.m154721d(list, "");
                    Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                    C89219l.m154716b(copyOf, "");
                    String[] strArr2 = (String[]) copyOf;
                    int childCount = t2.getChildCount();
                    for (int i4 = t2.f105969c; i4 < childCount; i4++) {
                        int i5 = i4 - t2.f105969c;
                        List<C45430a> list2 = t2.f105967a;
                        if (list2 == null) {
                            C89219l.m154710a("itemViewInfoList");
                        }
                        if (i5 < list2.size()) {
                            List<C45430a> list3 = t2.f105967a;
                            if (list3 == null) {
                                C89219l.m154710a("itemViewInfoList");
                            }
                            C45430a aVar2 = list3.get(i5);
                            strArr2[t2.f105970d] = aVar2.f105840b;
                            if (C45419a.m87987a(strArr2, list) > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            aVar2.f105839a = z;
                            View childAt = t2.getChildAt(i4);
                            C89219l.m154716b(childAt, "");
                            t2.mo76687a(childAt, aVar2);
                        }
                    }
                }
                i2 = i3;
            }
            AbstractC45503a aVar3 = this.f105999a.f105998d;
            if (aVar3 != null) {
                aVar3.mo76686a(strArr);
            }
        }

        C45505c(C45502d dVar, C89233z.C89238e eVar, List list) {
            this.f105999a = dVar;
            this.f106000b = eVar;
            this.f106001c = list;
        }
    }
}
