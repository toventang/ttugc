package com.p2082ss.android.ugc.aweme.emoji.systembigemoji;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.C46516b;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46644f;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46650j;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46654l;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89587ci;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.b */
public final class C46621b extends C46629g implements AbstractC46626d {

    /* renamed from: a */
    static final List<AbstractC46626d> f108716a = new ArrayList();

    /* renamed from: b */
    public static final C46621b f108717b = new C46621b();

    /* renamed from: f */
    private static final AbstractC89516am f108718f = C89517an.m155448a(C89546bf.f203266a);

    private C46621b() {
    }

    static {
        Covode.recordClassIndex(55212);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.b$b */
    static final class C46624b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f108725a;

        /* renamed from: b */
        final /* synthetic */ C46516b f108726b;

        /* renamed from: c */
        final /* synthetic */ List f108727c;

        static {
            Covode.recordClassIndex(55215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46624b(C46516b bVar, List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f108726b = bVar;
            this.f108727c = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46624b(this.f108726b, this.f108727c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46624b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f108725a == 0) {
                C89382r.m154942a(obj);
                C46621b.f108717b.mo79229a(this.f108726b, this.f108727c);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.b$a */
    public static final class C46622a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f108719a;

        /* renamed from: b */
        final /* synthetic */ List f108720b;

        /* renamed from: c */
        final /* synthetic */ boolean f108721c;

        static {
            Covode.recordClassIndex(55213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46622a(List list, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f108720b = list;
            this.f108721c = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46622a(this.f108720b, this.f108721c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46622a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f108719a;
            if (i == 0) {
                C89382r.m154942a(obj);
                List<C46516b> list = this.f108720b;
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                for (C46516b bVar : list) {
                    arrayList.add(C46621b.m89985a(bVar));
                }
                ArrayList arrayList2 = arrayList;
                final LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList2.size());
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    linkedHashMap.put(this.f108720b.get(i2), arrayList2.get(i2));
                }
                AbstractC89587ci ciVar = C89652o.f203399a;
                C466231 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46621b.C46622a.C466231 */

                    /* renamed from: a */
                    int f108722a;

                    /* renamed from: b */
                    final /* synthetic */ C46622a f108723b;

                    static {
                        Covode.recordClassIndex(55214);
                    }

                    {
                        this.f108723b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* renamed from: a */
                        static List<C46534a> m89985a(C46516b bVar) {
                            JSONObject jSONObject;
                            String a = C46644f.m90038a(new File(C46650j.m90055b(bVar) + "/info.json"));
                            ArrayList arrayList = new ArrayList();
                            if (C13627m.m24498a(a)) {
                                return arrayList;
                            }
                            try {
                                JSONArray jSONArray = new JSONObject(a).getJSONArray("stickers");
                                int length = jSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                    if (jSONObject2 != null) {
                                        C46534a aVar = new C46534a();
                                        aVar.setAnimateType(jSONObject2.getString("animate_type"));
                                        aVar.setDisplayName(jSONObject2.getString("display_name"));
                                        aVar.setId(jSONObject2.getLong("id"));
                                        aVar.setWidth(jSONObject2.getInt("width"));
                                        aVar.setHeight(jSONObject2.getInt("height"));
                                        String string = jSONObject2.getString("static_url");
                                        String string2 = jSONObject2.getString("animate_url");
                                        aVar.setStaticUrl(C46654l.m90059a(string, aVar.getWidth(), aVar.getHeight()));
                                        aVar.setStaticType(jSONObject2.getString("static_type"));
                                        aVar.setAnimateUrl(C46654l.m90059a(string2, aVar.getWidth(), aVar.getHeight()));
                                        aVar.setVersion(bVar.getVersion());
                                        aVar.setResourcesId(bVar.getId());
                                        Iterator<String> it = null;
                                        try {
                                            jSONObject = jSONObject2.getJSONObject("display_name_lang");
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                            jSONObject = null;
                                        }
                                        if (jSONObject != null) {
                                            it = jSONObject.keys();
                                        }
                                        if (it != null) {
                                            HashMap<String, String> hashMap = new HashMap<>();
                                            Iterator<String> keys = jSONObject.keys();
                                            while (keys.hasNext()) {
                                                String next = keys.next();
                                                C89219l.m154716b(next, "");
                                                String string3 = jSONObject.getString(next);
                                                C89219l.m154716b(string3, "");
                                                hashMap.put(next, string3);
                                            }
                                            aVar.setDisplayNameLangs(hashMap);
                                        }
                                        arrayList.add(aVar);
                                    }
                                }
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                            return arrayList;
                        }

                        @Override // com.p2082ss.android.ugc.aweme.emoji.systembigemoji.AbstractC46626d
                        /* renamed from: a */
                        public final void mo79230a(LinkedHashMap<C46516b, List<C46534a>> linkedHashMap) {
                            for (AbstractC46626d dVar : f108716a) {
                                dVar.mo79230a(linkedHashMap);
                            }
                        }

                        @Override // com.p2082ss.android.ugc.aweme.emoji.systembigemoji.AbstractC46626d
                        /* renamed from: a */
                        public final void mo79229a(C46516b bVar, List<? extends C46534a> list) {
                            C89219l.m154721d(bVar, "");
                            for (AbstractC46626d dVar : f108716a) {
                                dVar.mo79229a(bVar, list);
                            }
                        }

                        /* access modifiers changed from: protected */
                        @Override // com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46629g
                        /* renamed from: a */
                        public final void mo79231a(C46516b bVar, boolean z) {
                            List<C46534a> list;
                            C89219l.m154721d(bVar, "");
                            if (z) {
                                list = m89985a(bVar);
                            } else {
                                list = null;
                            }
                            AbstractC89568bz unused = C89624i.m155555a(f108718f, C89652o.f203399a, null, new C46624b(bVar, list, null), 2);
                        }

                        /* access modifiers changed from: protected */
                        @Override // com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46629g
                        /* renamed from: a */
                        public final void mo79232a(String str, List<? extends C46516b> list, boolean z) {
                            C89219l.m154721d(str, "");
                            C89219l.m154721d(list, "");
                            AbstractC89568bz unused = C89624i.m155555a(f108718f, null, null, new C46622a(list, z, null), 3);
                        }
                    }
