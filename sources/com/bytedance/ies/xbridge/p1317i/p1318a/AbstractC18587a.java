package com.bytedance.ies.xbridge.p1317i.p1318a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18610a;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18612b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.i.a.a */
public abstract class AbstractC18587a extends AbstractC18468a {

    /* renamed from: a */
    private final String f44280a = "x.chooseMedia";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44281b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.i.a.a$a */
    public interface AbstractC18588a {
        static {
            Covode.recordClassIndex(21282);
        }

        /* renamed from: a */
        void mo29670a(int i, String str);

        /* renamed from: a */
        void mo29671a(C18612b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21281);
    }

    /* renamed from: a */
    public abstract void mo29669a(C18610a aVar, AbstractC18588a aVar2, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44280a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44281b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18610a> mo29415d() {
        return C18610a.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18612b> mo29416e() {
        return C18612b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.i.a.a$b */
    public static final class C18589b implements AbstractC18588a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18587a f44282a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44283b;

        static {
            Covode.recordClassIndex(21283);
        }

        C18589b(AbstractC18587a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44282a = aVar;
            this.f44283b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18587a.AbstractC18588a
        /* renamed from: a */
        public final void mo29670a(int i, String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44283b, i, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18587a.AbstractC18588a
        /* renamed from: a */
        public final void mo29671a(C18612b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(bVar, "");
            if (bVar.f44334a == null) {
                AbstractC18468a.m34357a(this.f44283b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            List<C18612b.C18614b> list = bVar.f44334a;
            if (list != null) {
                for (T t : list) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("tempFilePath", t.f44336b);
                    linkedHashMap2.put("size", Long.valueOf(t.f44337c));
                    linkedHashMap2.put("mediaType", t.f44338d);
                    byte[] bArr = t.f44339e;
                    if (bArr == null) {
                        bArr = "";
                    }
                    linkedHashMap2.put("binaryData", bArr);
                    String str2 = t.f44335a;
                    if (str2 != null) {
                        linkedHashMap2.put("base64Data", str2);
                    }
                    arrayList.add(linkedHashMap2);
                }
            }
            linkedHashMap.put("tempFiles", arrayList);
            AbstractC18587a.m34358a(this.f44283b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        AbstractC18700m c = C18586i.m34544c(nVar, "mediaTypes");
        if (c != null) {
            ArrayList arrayList = new ArrayList();
            int a = c.mo29730a();
            for (int i = 0; i < a; i++) {
                arrayList.add(c.mo29735d(i));
            }
            String str = C18586i.m34539a(nVar, "sourceType", "");
            if (str.length() != 0) {
                int a2 = C18586i.m34537a(nVar, "maxCount", 1);
                boolean a3 = C18586i.m34542a(nVar, "compressImage", false);
                boolean a4 = C18586i.m34542a(nVar, "saveToPhotoAlbum", false);
                String str2 = C18586i.m34539a(nVar, "cameraType", "");
                boolean a5 = C18586i.m34542a(nVar, "needBinaryData", false);
                int a6 = C18586i.m34537a(nVar, "compressWidth", 0);
                int a7 = C18586i.m34537a(nVar, "compressHeight", 0);
                boolean a8 = C18586i.m34542a(nVar, "isNeedCut", false);
                int a9 = C18586i.m34537a(nVar, "cropRatioHeight", 0);
                int a10 = C18586i.m34537a(nVar, "cropRatioWidth", 0);
                boolean a11 = C18586i.m34542a(nVar, "needBase64Data", false);
                C18610a aVar = new C18610a();
                C89219l.m154719c(arrayList, "");
                aVar.f44320a = arrayList;
                C89219l.m154719c(str, "");
                aVar.f44321b = str;
                aVar.f44322c = a2;
                aVar.f44323d = a3;
                aVar.f44324e = a4;
                C89219l.m154719c(str2, "");
                aVar.f44325f = str2;
                aVar.f44326g = a5;
                aVar.f44327h = a6;
                aVar.f44328i = a7;
                aVar.f44329j = a8;
                aVar.f44330k = a10;
                aVar.f44331l = a9;
                aVar.f44332m = a11;
                mo29669a(aVar, new C18589b(this, bVar), eVar);
                return;
            }
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
