package com.bytedance.tux.table;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.bytedance.tux.table.b */
public abstract class EnumC23277b extends Enum<EnumC23277b> {
    public static final EnumC23277b PADDING_16;
    public static final EnumC23277b PADDING_32;

    /* renamed from: a */
    private static final /* synthetic */ EnumC23277b[] f55185a;

    static {
        Covode.recordClassIndex(27227);
        C23278a aVar = new C23278a("PADDING_16");
        PADDING_16 = aVar;
        C23279b bVar = new C23279b("PADDING_32");
        PADDING_32 = bVar;
        f55185a = new EnumC23277b[]{aVar, bVar};
    }

    public static EnumC23277b valueOf(String str) {
        return (EnumC23277b) Enum.valueOf(EnumC23277b.class, str);
    }

    public static EnumC23277b[] values() {
        return (EnumC23277b[]) f55185a.clone();
    }

    public abstract int toPx();

    /* renamed from: com.bytedance.tux.table.b$a */
    static final class C23278a extends EnumC23277b {
        static {
            Covode.recordClassIndex(27228);
        }

        @Override // com.bytedance.tux.table.EnumC23277b
        public final int toPx() {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            return C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C23278a(String str) {
            super(str, 0, null);
        }
    }

    /* renamed from: com.bytedance.tux.table.b$b */
    static final class C23279b extends EnumC23277b {
        static {
            Covode.recordClassIndex(27229);
        }

        @Override // com.bytedance.tux.table.EnumC23277b
        public final int toPx() {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            return C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C23279b(String str) {
            super(str, 1, null);
        }
    }

    private EnumC23277b(String str, int i) {
    }

    public /* synthetic */ EnumC23277b(String str, int i, C89214g gVar) {
        this(str, i);
    }
}
