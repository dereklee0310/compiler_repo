;---------------    Debug Info     ---------------;

;--------------- Unnamed Variables ---------------;

@.str.0 = private unnamed_addr constant [66 x i8] c"Test simple declaration, initialization, assignment and printf()\0A\00"
@.str.1 = private unnamed_addr constant [3 x i8] c"%d\00"
@.str.2 = private unnamed_addr constant [2 x i8] c"\0A\00"
@.str.3 = private unnamed_addr constant [7 x i8] c"%d\0A%d\0A\00"
@.str.4 = private unnamed_addr constant [4 x i8] c"%d\0A\00"

;--------------- Global Variables  ---------------;

@g1 = dso_local global i32 0, align 4
@g2 = dso_local global i32 1, align 4

;---------------     Main Code     ---------------;

declare dso_local i32 @printf(i8*, ...)

define dso_local i32 @main()

{
%t4 = alloca i32, align 4
%t3 = alloca i32, align 4
store i32 3, i32* %t3, align 4
store i32 0, i32* @g1, align 4
store i32 2, i32* %t4, align 4
%t10 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([66 x i8], [66 x i8]* @.str.0, i64 0, i64 0))
%t14 = load i32, i32* @g1, align 4
%t15 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([3 x i8], [3 x i8]* @.str.1, i64 0, i64 0), i32 noundef %t14)
%t19 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([2 x i8], [2 x i8]* @.str.2, i64 0, i64 0))
%t23 = load i32, i32* @g2, align 4
%t24 = load i32, i32* %t4, align 4
%t25 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([7 x i8], [7 x i8]* @.str.3, i64 0, i64 0), i32 noundef %t23, i32 noundef %t24)
%t29 = load i32, i32* %t3, align 4
%t30 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([4 x i8], [4 x i8]* @.str.4, i64 0, i64 0), i32 noundef %t29)
ret i32 0
}
