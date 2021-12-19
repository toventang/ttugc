package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.Map;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.FriendUserInfo */
public final class FriendUserInfo extends Message<FriendUserInfo, Builder> {
    public static final ProtoAdapter<FriendUserInfo> ADAPTER = new ProtoAdapter_FriendUserInfo();
    public static final Long DEFAULT_APPLY_TIME_SECOND = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "apply_time_second")
    public final Long apply_time_second;
    @AbstractC27891c(mo46611a = "ext")
    public final Map<String, String> ext;
    @AbstractC27891c(mo46611a = "profile")
    public final Profile profile;
    @AbstractC27891c(mo46611a = "user_id")
    public final Long user_id;

    /* renamed from: com.bytedance.im.core.proto.FriendUserInfo$ProtoAdapter_FriendUserInfo */
    static final class ProtoAdapter_FriendUserInfo extends ProtoAdapter<FriendUserInfo> {
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23118);
        }

        public ProtoAdapter_FriendUserInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, FriendUserInfo.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.FriendUserInfo$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.FriendUserInfo redact(com.bytedance.p1399im.core.proto.FriendUserInfo r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.FriendUserInfo$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.Profile r0 = r2.profile
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.Profile> r1 = com.bytedance.p1399im.core.proto.Profile.ADAPTER
                com.bytedance.im.core.proto.Profile r0 = r2.profile
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.Profile r0 = (com.bytedance.p1399im.core.proto.Profile) r0
                r2.profile = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.FriendUserInfo r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.FriendUserInfo.ProtoAdapter_FriendUserInfo.redact(com.bytedance.im.core.proto.FriendUserInfo):com.bytedance.im.core.proto.FriendUserInfo");
        }

        public final int encodedSize(FriendUserInfo friendUserInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, friendUserInfo.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, friendUserInfo.apply_time_second) + this.ext.encodedSizeWithTag(3, friendUserInfo.ext) + Profile.ADAPTER.encodedSizeWithTag(4, friendUserInfo.profile) + friendUserInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FriendUserInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.user_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.apply_time_second(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.ext.putAll(this.ext.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.profile(Profile.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, FriendUserInfo friendUserInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, friendUserInfo.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, friendUserInfo.apply_time_second);
            this.ext.encodeWithTag(protoWriter, 3, friendUserInfo.ext);
            Profile.ADAPTER.encodeWithTag(protoWriter, 4, friendUserInfo.profile);
            protoWriter.writeBytes(friendUserInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.FriendUserInfo$Builder */
    public static final class Builder extends Message.Builder<FriendUserInfo, Builder> {
        public Long apply_time_second;
        public Map<String, String> ext = Internal.newMutableMap();
        public Profile profile;
        public Long user_id;

        static {
            Covode.recordClassIndex(23117);
        }

        @Override // com.squareup.wire.Message.Builder
        public final FriendUserInfo build() {
            return new FriendUserInfo(this.user_id, this.apply_time_second, this.ext, this.profile, super.buildUnknownFields());
        }

        public final Builder apply_time_second(Long l) {
            this.apply_time_second = l;
            return this;
        }

        public final Builder profile(Profile profile2) {
            this.profile = profile2;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23116);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "FriendUserInfo" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.FriendUserInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<FriendUserInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.user_id = this.user_id;
        builder.apply_time_second = this.apply_time_second;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.profile = this.profile;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public FriendUserInfo(Long l, Long l2, Map<String, String> map, Profile profile2) {
        this(l, l2, map, profile2, C89427i.EMPTY);
    }

    public FriendUserInfo(Long l, Long l2, Map<String, String> map, Profile profile2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.user_id = l;
        this.apply_time_second = l2;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.profile = profile2;
    }
}
