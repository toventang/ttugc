package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.NinePatchDiv;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.t */
public final class C46190t {

    /* renamed from: e */
    public static final int f107594e = 1;

    /* renamed from: f */
    public static final C46191a f107595f = new C46191a((byte) 0);

    /* renamed from: a */
    public List<NinePatchDiv> f107596a = new ArrayList();

    /* renamed from: b */
    public List<NinePatchDiv> f107597b = new ArrayList();

    /* renamed from: c */
    public Rect f107598c = new Rect();

    /* renamed from: d */
    public int[] f107599d = new int[0];

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.t$a */
    public static final class C46191a {
        static {
            Covode.recordClassIndex(54750);
        }

        private C46191a() {
        }

        public /* synthetic */ C46191a(byte b) {
            this();
        }

        /* renamed from: a */
        static List<NinePatchDiv> m89124a(List<NinePatchDiv> list, int i) {
            ArrayList arrayList = new ArrayList();
            if (list == null || list.isEmpty()) {
                return arrayList;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                NinePatchDiv ninePatchDiv = list.get(i2);
                if (i2 == 0) {
                    if (ninePatchDiv.getStart() != 0) {
                        arrayList.add(new NinePatchDiv(0, ninePatchDiv.getStart() - 1));
                    }
                } else if (i2 > 0) {
                    arrayList.add(new NinePatchDiv(list.get(i2 - 1).getEnd(), ninePatchDiv.getStart() - 1));
                }
                arrayList.add(new NinePatchDiv(ninePatchDiv.getStart(), ninePatchDiv.getEnd() - 1));
                if (i2 == list.size() - 1 && ninePatchDiv.getEnd() < i) {
                    arrayList.add(new NinePatchDiv(ninePatchDiv.getEnd(), i - 1));
                }
            }
            return arrayList;
        }
    }

    static {
        Covode.recordClassIndex(54749);
    }

    /* renamed from: a */
    public final byte[] mo78430a() {
        ByteBuffer order = ByteBuffer.allocate((this.f107596a.size() * 2 * 4) + 32 + (this.f107597b.size() * 2 * 4) + (this.f107599d.length * 4)).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) (this.f107596a.size() * 2));
        order.put((byte) (this.f107597b.size() * 2));
        order.put((byte) this.f107599d.length);
        order.putInt(0);
        order.putInt(0);
        order.putInt(this.f107598c.left);
        order.putInt(this.f107598c.right);
        order.putInt(this.f107598c.top);
        order.putInt(this.f107598c.bottom);
        order.putInt(0);
        for (NinePatchDiv ninePatchDiv : this.f107596a) {
            order.putInt(ninePatchDiv.getStart());
            order.putInt(ninePatchDiv.getEnd());
        }
        for (NinePatchDiv ninePatchDiv2 : this.f107597b) {
            order.putInt(ninePatchDiv2.getStart());
            order.putInt(ninePatchDiv2.getEnd());
        }
        for (int i : this.f107599d) {
            order.putInt(i);
        }
        byte[] array = order.array();
        C89219l.m154716b(array, "");
        return array;
    }

    /* renamed from: a */
    public final void mo78428a(Rect rect) {
        C89219l.m154721d(rect, "");
        this.f107598c = rect;
    }

    /* renamed from: a */
    public final void mo78429a(int[] iArr) {
        C89219l.m154721d(iArr, "");
        this.f107599d = iArr;
    }
}
