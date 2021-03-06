// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: game.proto

package top.liubowen.proto;

public final class GameProto {
  private GameProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   ** 游戏类型 
   * </pre>
   *
   * Protobuf enum {@code gameProto.GameType}
   */
  public enum GameType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *  推筒子
     * </pre>
     *
     * <code>TUI_TONG_ZI = 0;</code>
     */
    TUI_TONG_ZI(0),
    /**
     * <pre>
     *  卡五星
     * </pre>
     *
     * <code>KA_WU_XING = 1;</code>
     */
    KA_WU_XING(1),
    /**
     * <pre>
     *  血流成河
     * </pre>
     *
     * <code>XUE_LIU_CHENG_HE = 2;</code>
     */
    XUE_LIU_CHENG_HE(2),
    /**
     * <pre>
     *  血战到底
     * </pre>
     *
     * <code>XUE_ZHAN_DAO_DI = 3;</code>
     */
    XUE_ZHAN_DAO_DI(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *  推筒子
     * </pre>
     *
     * <code>TUI_TONG_ZI = 0;</code>
     */
    public static final int TUI_TONG_ZI_VALUE = 0;
    /**
     * <pre>
     *  卡五星
     * </pre>
     *
     * <code>KA_WU_XING = 1;</code>
     */
    public static final int KA_WU_XING_VALUE = 1;
    /**
     * <pre>
     *  血流成河
     * </pre>
     *
     * <code>XUE_LIU_CHENG_HE = 2;</code>
     */
    public static final int XUE_LIU_CHENG_HE_VALUE = 2;
    /**
     * <pre>
     *  血战到底
     * </pre>
     *
     * <code>XUE_ZHAN_DAO_DI = 3;</code>
     */
    public static final int XUE_ZHAN_DAO_DI_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GameType valueOf(int value) {
      return forNumber(value);
    }

    public static GameType forNumber(int value) {
      switch (value) {
        case 0: return TUI_TONG_ZI;
        case 1: return KA_WU_XING;
        case 2: return XUE_LIU_CHENG_HE;
        case 3: return XUE_ZHAN_DAO_DI;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GameType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GameType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GameType>() {
            public GameType findValueByNumber(int number) {
              return GameType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return top.liubowen.proto.GameProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final GameType[] VALUES = values();

    public static GameType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GameType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:gameProto.GameType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ngame.proto\022\tgameProto*V\n\010GameType\022\017\n\013T" +
      "UI_TONG_ZI\020\000\022\016\n\nKA_WU_XING\020\001\022\024\n\020XUE_LIU_" +
      "CHENG_HE\020\002\022\023\n\017XUE_ZHAN_DAO_DI\020\003B\037\n\022top.l" +
      "iubowen.protoB\tGameProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
