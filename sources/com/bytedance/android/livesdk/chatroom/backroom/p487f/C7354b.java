package com.bytedance.android.livesdk.chatroom.backroom.p487f;

import com.bytedance.android.livesdk.livesetting.watchlive.BackRoomListSettingConfigSetting;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.android.livesdk.chatroom.backroom.f.b */
public final class C7354b {

    /* renamed from: a */
    public static final AbstractC89244h f18229a = C89250i.m154773a((AbstractC89171a) C7357c.f18236a);

    /* renamed from: b */
    public static final AbstractC89244h f18230b = C89250i.m154773a((AbstractC89171a) C7358d.f18237a);

    /* renamed from: c */
    public static final C7354b f18231c = new C7354b();

    /* renamed from: d */
    private static final AbstractC89244h f18232d = C89250i.m154773a((AbstractC89171a) C7355a.f18234a);

    /* renamed from: e */
    private static final AbstractC89244h f18233e = C89250i.m154773a((AbstractC89171a) C7356b.f18235a);

    /* renamed from: a */
    public static List<String> m15258a() {
        return (List) f18232d.getValue();
    }

    /* renamed from: b */
    public static List<String> m15259b() {
        return (List) f18233e.getValue();
    }

    private C7354b() {
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.f.b$d */
    static final class C7358d extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C7358d f18237a = new C7358d();

        static {
            Covode.recordClassIndex(8122);
        }

        C7358d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().f18964c;
            if (list == null) {
                return new ArrayList();
            }
            return list;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.f.b$a */
    static final class C7355a extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C7355a f18234a = new C7355a();

        static {
            Covode.recordClassIndex(8119);
        }

        C7355a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().f18962a;
            if (list == null) {
                return C89070n.m154525d("jump_source_room_back", "jump_source_mic_room");
            }
            return list;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.f.b$b */
    static final class C7356b extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C7356b f18235a = new C7356b();

        static {
            Covode.recordClassIndex(8120);
        }

        C7356b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().f18963b;
            if (list == null) {
                return C89070n.m154525d("jump_source_all");
            }
            return list;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.f.b$c */
    static final class C7357c extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C7357c f18236a = new C7357c();

        static {
            Covode.recordClassIndex(8121);
        }

        C7357c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().f18963b;
            if (list == null) {
                return C89070n.m154525d("jump_source_all", "jump_source_live_end", "jump_source_mic_room");
            }
            return list;
        }
    }

    static {
        Covode.recordClassIndex(8118);
    }
}
