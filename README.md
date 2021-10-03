数据结构

引言

第一章

第二章：线性表

第三章：栈和队列

第四章：串

第五章：多维数组和广义表

第六章：树

6.1树的概念

常见考点1：节点数=总度数+1 
	结点的度--结点有几个孩子（分支）

常见考点2：度为m的树、m叉树的区别

常见考点3：度为m的树第i层至多有m^ {i-1}个结点（i>=1）

	m叉树第i层至多有m^ {i-1}个结点（i>=1)

常见考点4：高度为h的m叉树至多有\frac {m^{h-1}}{m-1}

	等比数列求和公式:a+aq+aq^2+...+aq^{n-1} = \frac {a(1-q^n)}{1-q}

常见考点5:高度为h的m叉树至少有h个结点。

	高度为h、度为m的树至少有h+m-1个结点。

考点6:具有n个结点的m叉树的最小高度为log_m(n(m-1)+1)

6.2用土办法找到中序前驱

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



第七章：图

第八章：查找

第九章：排序
