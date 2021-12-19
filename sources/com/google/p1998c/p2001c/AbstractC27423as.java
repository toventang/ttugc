package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.c.c.as */
public abstract class AbstractC27423as<K0, V0> {
    static {
        Covode.recordClassIndex(33003);
    }

    /* renamed from: com.google.c.c.as$d */
    public static abstract class AbstractC27429d<K0> {
        static {
            Covode.recordClassIndex(33009);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo45763a();

        AbstractC27429d() {
        }

        /* renamed from: b */
        public final AbstractC27428c<K0, Object> mo45765b() {
            C27511k.m54993a(2, "expectedValuesPerKey");
            return new AbstractC27428c<K0, Object>() {
                /* class com.google.p1998c.p2001c.AbstractC27423as.AbstractC27429d.C274301 */

                /* renamed from: a */
                final /* synthetic */ int f64730a = 2;

                static {
                    Covode.recordClassIndex(33010);
                }

                @Override // com.google.p1998c.p2001c.AbstractC27423as.AbstractC27428c
                /* renamed from: b */
                public final <K extends K0, V> AbstractC27403ao<K, V> mo45764b() {
                    return C27432at.m54839a(AbstractC27429d.this.mo45763a(), new C27426a(this.f64730a));
                }
            };
        }
    }

    private AbstractC27423as() {
    }

    /* renamed from: com.google.c.c.as$a */
    static final class C27426a<V> implements AbstractC27255q<List<V>>, Serializable {

        /* renamed from: a */
        private final int f64727a;

        static {
            Covode.recordClassIndex(33006);
        }

        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* synthetic */ Object mo5560b() {
            return new ArrayList(this.f64727a);
        }

        C27426a(int i) {
            this.f64727a = C27511k.m54993a(i, "expectedValuesPerKey");
        }
    }

    /* renamed from: com.google.c.c.as$b */
    enum EnumC27427b implements AbstractC27255q<List<Object>> {
        INSTANCE;

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* synthetic */ List<Object> mo5560b() {
            return new LinkedList();
        }

        static {
            Covode.recordClassIndex(33007);
        }
    }

    /* renamed from: com.google.c.c.as$c */
    public static abstract class AbstractC27428c<K0, V0> extends AbstractC27423as<K0, V0> {
        static {
            Covode.recordClassIndex(33008);
        }

        /* renamed from: b */
        public abstract <K extends K0, V extends V0> AbstractC27403ao<K, V> mo45764b();

        AbstractC27428c() {
            super((byte) 0);
        }
    }

    /* renamed from: a */
    public static AbstractC27429d<Object> m54829a() {
        C27511k.m54993a(8, "expectedKeys");
        return new AbstractC27429d<Object>() {
            /* class com.google.p1998c.p2001c.AbstractC27423as.C274252 */

            /* renamed from: a */
            final /* synthetic */ int f64726a = 8;

            static {
                Covode.recordClassIndex(33005);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2001c.AbstractC27423as.AbstractC27429d
            /* renamed from: a */
            public final <K, V> Map<K, Collection<V>> mo45763a() {
                return new C27526o(this.f64726a);
            }
        };
    }

    /* synthetic */ AbstractC27423as(byte b) {
        this();
    }
}
