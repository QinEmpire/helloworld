//中序遍历
void findPre(BiTree T){
    if(T!=NULL){
        findPre(T->lchild);
        visit(T);
        findPre(T->rchild);
    }
}

//访问节点Q
void visit(BiTNode *q){
    if(q==p){  //当前访问结点刚好是节点P
        final = pre; //找到P的前驱
    }else{
        pre = q;  //pre指向当前访问的结点
    }
}

//辅助全局变量，用于查找节点P的前驱
BiTNode *p;   //p指向目标结点
BiTNode *pre = NULL;  //指向当前访问结点的前驱
BiTNode *final = NULL; //用于记录最终结果
